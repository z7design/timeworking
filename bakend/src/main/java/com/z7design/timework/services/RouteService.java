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

import com.z7design.timework.dto.RouteDTO;
import com.z7design.timework.entities.Route;
import com.z7design.timework.repositories.RouteRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class RouteService {

		@Autowired
		private RouteRepository repository;
		
		@Transactional(readOnly = true)
		public Page<RouteDTO> findAllPaged(Pageable pageable) {
			//List<Route> route = (routeId == 0) ? null : Arrays.asList(repository.getOne(routeId));
			Page<Route> list = repository.findAll(pageable);
			//repository.findProductsWithRoute(page.getContent());
			return list.map(x -> new RouteDTO(x));
		}

		@Transactional(readOnly = true)
		public RouteDTO findById(Long id) {
			Optional<Route> obj = repository.findById(id);
			Route entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new RouteDTO(entity);
		}	
		@Transactional
		public RouteDTO insert(RouteDTO dto) {
			Route entity = new Route();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new RouteDTO(entity);
		}

		@Transactional
		public RouteDTO update(Long id, RouteDTO dto) {
			try {
				Route entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new RouteDTO(entity);
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

		private void copyDtoToEntity(RouteDTO dto, Route entity) {
			entity.setName(dto.getName());
			entity.setCodeRoute(dto.getCodeRoute());

		}

	}
