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

import com.z7design.timework.dto.OnDutyDTO;
import com.z7design.timework.entities.OnDuty;
import com.z7design.timework.repositories.OnDutytRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class OnDutyService {

		@Autowired
		private OnDutytRepository repository;


		@Transactional(readOnly = true)
		public Page<OnDutyDTO> findAllPaged(PageRequest pageRequest) {
			Page<OnDuty> list = repository.findAll(pageRequest);
			return list.map(x -> new OnDutyDTO(x));
		}

		@Transactional(readOnly = true)
		public OnDutyDTO findById(Long id) {
			Optional<OnDuty> obj = repository.findById(id);
			OnDuty entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new OnDutyDTO(entity, 
					entity.getDriverss(), 
					entity.getFleets(), 
					entity.getClients(), 
					entity.getRoutes()
				);
		}
		
		@Transactional
		public OnDutyDTO insert(OnDutyDTO dto) {
			OnDuty entity = new OnDuty();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new OnDutyDTO(entity);
		}

		@Transactional
		public OnDutyDTO update(Long id, OnDutyDTO dto) {
			try {
				OnDuty entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new OnDutyDTO(entity);
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

		private void copyDtoToEntity(OnDutyDTO dto, OnDuty entity) {
			entity.setHoursInitial(dto.getHoursInitial()); 
			entity.setHoursFinish(dto.getHoursFinish()); 
			entity.setShift(dto.getShift());
			entity.setDateRegister(dto.getDateRegister());		
		}

	}
