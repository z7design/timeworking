package com.z7design.timework.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z7design.timework.dto.FleetDTO;
import com.z7design.timework.entities.Fleet;
import com.z7design.timework.repositories.FleetRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class FleetService {

		@Autowired
		private FleetRepository repository;

		@Transactional(readOnly = true)
		public Page<FleetDTO> findAllPaged(PageRequest pageRequest) {
			Page<Fleet> list = repository.findAll(pageRequest);
			return list.map(x -> new FleetDTO(x));
		}

		@Transactional(readOnly = true)
		public FleetDTO findById(Long id) {
			Optional<Fleet> obj = repository.findById(id);
			Fleet entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new FleetDTO(entity, entity.getRoutes());
		}

		@Transactional
		public FleetDTO insert(FleetDTO dto) {
			Fleet entity = new Fleet();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new FleetDTO(entity);
		}

		@Transactional
		public FleetDTO update(Long id, FleetDTO dto) {
			try {
				Fleet entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new FleetDTO(entity);
			} catch (EntityNotFoundException e) {
				throw new ResourceNotFoundException("Opss!! Id Não encontrado" + id);
			}
		}

		public void delete(Long id) {
			try {
				repository.deleteById(id);
			} catch (EmptyResultDataAccessException e) {
				throw new ResourceNotFoundException("Opss!! Id Não encontrado" + id);
			} catch (DataIntegrityViolationException e) {
				throw new DatabaseException("Violação de Integração");
			}
		}

		private void copyDtoToEntity(FleetDTO dto, Fleet entity) {
			entity.setNumber(dto.getNumber());
			entity.setDescription(dto.getDescription());			
		}
	}
