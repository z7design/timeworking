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

import com.z7design.timework.dto.ClientDTO;
import com.z7design.timework.dto.RouteDTO;
import com.z7design.timework.entities.Client;
import com.z7design.timework.entities.Route;
import com.z7design.timework.repositories.ClientRepository;
import com.z7design.timework.repositories.RouteRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class ClientService {

		@Autowired
		private ClientRepository repository;
		
		@Autowired
		private RouteRepository routeRepository;

		@Transactional(readOnly = true)
		public Page<ClientDTO> findAllPaged(Pageable pageable) {
			//List<Driver> drivers = (driverId == 0) ? null : Arrays.asList(driverRepository.getOne(driverId));
			Page<Client> list = repository.findAll(pageable);
			//repository.findProductsWithDriverss(page.getContent());
			return list.map(x -> new ClientDTO(x));
		}

		@Transactional(readOnly = true)
		public ClientDTO findById(Long id) {
			Optional<Client> obj = repository.findById(id);
			Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new ClientDTO(entity, entity.getRoutes());
		}
		
		@Transactional
		public ClientDTO insert(ClientDTO dto) {
			Client entity = new Client();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ClientDTO(entity);
		}

		@Transactional
		public ClientDTO update(Long id, ClientDTO dto) {
			try {
				Client entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new ClientDTO(entity);
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

		private void copyDtoToEntity(ClientDTO dto, Client entity) {
			entity.setName(dto.getName()); 
		
			
			entity.getRoutes().clear();
			for (RouteDTO rotDto : dto.getRoutes()) {
				Route routes = routeRepository.getOne(rotDto.getId());
				entity.getRoutes().add(routes);			
			}
		}

	}
