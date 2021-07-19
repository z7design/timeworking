
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

import com.z7design.timework.dto.DriverDTO;
import com.z7design.timework.entities.Driver;
import com.z7design.timework.repositories.DriverRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class DriverService {

		@Autowired
		private DriverRepository repository;

		@Transactional(readOnly = true)
		public Page<DriverDTO> findAllPaged(PageRequest pageRequest) {
			Page<Driver> list = repository.findAll(pageRequest);
			return list.map(x -> new DriverDTO(x));
		}

		@Transactional(readOnly = true)
		public DriverDTO findById(Long id) {
			Optional<Driver> obj = repository.findById(id);
			Driver entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new DriverDTO(entity, entity.getFleets());
		}

		@Transactional
		public DriverDTO insert(DriverDTO dto) {
			Driver entity = new Driver();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new DriverDTO(entity);
		}

		@Transactional
		public DriverDTO update(Long id, DriverDTO dto) {
			try {
				Driver entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new DriverDTO(entity);
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

		private void copyDtoToEntity(DriverDTO dto, Driver entity) {
			entity.setName(dto.getName());
			entity.setImgUrl(dto.getImgUrl());
			entity.setCelphone(dto.getCelphone());
			entity.setEmail(dto.getEmail());
			entity.setCep(dto.getCep());
			entity.setCnh(dto.getCnh());
			entity.setRg(dto.getRg());
			entity.setCpf(dto.getCpf());
		}
	}

