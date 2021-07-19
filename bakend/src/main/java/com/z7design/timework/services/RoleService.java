package com.z7design.timework.services;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z7design.timework.dto.RoleDTO;
import com.z7design.timework.entities.Role;
import com.z7design.timework.repositories.RoleRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class RoleService {

		@Autowired
		private RoleRepository repository;
		
		@Transactional(readOnly = true)
		public Page<RoleDTO> findAllPaged(Pageable pageable) {
			//List<Role> route = (routeId == 0) ? null : Arrays.asList(repository.getOne(routeId));
			Page<Role> list = repository.findAll(pageable);
			//repository.findProductsWithRole(page.getContent());
			return list.map(x -> new RoleDTO(x));
		}

		@Transactional(readOnly = true)
		public RoleDTO findById(Long id) {
			Optional<Role> obj = repository.findById(id);
			Role entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new RoleDTO(entity);
		}
		
		@Transactional
		public RoleDTO insert(RoleDTO dto) {
			Role entity = new Role();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new RoleDTO(entity);
		}

		@Transactional
		public RoleDTO update(Long id, RoleDTO dto) {
			try {
				Role entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new RoleDTO(entity);
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

		private void copyDtoToEntity(RoleDTO dto, Role entity) {
			entity.setAuthority(dto.getAuthority());
		}

	}
