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
import com.z7design.timework.dto.DriverDTO;
import com.z7design.timework.dto.FleetDTO;
import com.z7design.timework.dto.RouteDTO;
import com.z7design.timework.dto.ShedulesTeamsDTO;
import com.z7design.timework.entities.Client;
import com.z7design.timework.entities.Driver;
import com.z7design.timework.entities.Fleet;
import com.z7design.timework.entities.Route;
import com.z7design.timework.entities.ShedulesTeams;
import com.z7design.timework.repositories.ClientRepository;
import com.z7design.timework.repositories.DriverRepository;
import com.z7design.timework.repositories.FleetRepository;
import com.z7design.timework.repositories.RouteRepository;
import com.z7design.timework.repositories.ShedulesTeamsRepository;
import com.z7design.timework.services.exceptions.DatabaseException;
import com.z7design.timework.services.exceptions.ResourceNotFoundException;


@Service
public class ShedulesTeamsService {

		@Autowired
		private ShedulesTeamsRepository repository;
		
		@Autowired
		private DriverRepository driverRepository;
		
		@Autowired
		private FleetRepository fleetRepository;
		
		@Autowired
		private ClientRepository clientRepository;
		
		@Autowired
		private RouteRepository routeRepository;

		@Transactional(readOnly = true)
		public Page<ShedulesTeamsDTO> findAllPaged(Pageable pageable) {
			//List<Driver> drivers = (driverId == 0) ? null : Arrays.asList(driverRepository.getOne(driverId));
			Page<ShedulesTeams> list = repository.findAll(pageable);
			//repository.findProductsWithDriverss(page.getContent());
			return list.map(x -> new ShedulesTeamsDTO(x, x.getDriverss(), x.getFleets(), x.getClients(), x.getRoutes()));
		}

		@Transactional(readOnly = true)
		public ShedulesTeamsDTO findById(Long id) {
			Optional<ShedulesTeams> obj = repository.findById(id);
			ShedulesTeams entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
			return new ShedulesTeamsDTO(entity, 
					entity.getDriverss(), 
					entity.getFleets(), 
					entity.getClients(), 
					entity.getRoutes()
				);
		}	
		@Transactional
		public ShedulesTeamsDTO insert(ShedulesTeamsDTO dto) {
			ShedulesTeams entity = new ShedulesTeams();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ShedulesTeamsDTO(entity);
		}

		@Transactional
		public ShedulesTeamsDTO update(Long id, ShedulesTeamsDTO dto) {
			try {
				ShedulesTeams entity = repository.getOne(id);
				copyDtoToEntity(dto, entity);
				entity = repository.save(entity);
				return new ShedulesTeamsDTO(entity);
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

		private void copyDtoToEntity(ShedulesTeamsDTO dto, ShedulesTeams entity) {
			entity.setHoursInitial(dto.getHoursInitial()); 
			entity.setHoursFinish(dto.getHoursFinish()); 
			entity.setShift(dto.getShift());
			entity.setDateRegister(dto.getDateRegister());
			entity.setInputType(dto.getInputType());
			entity.setOutputType(dto.getOutputType());
			
			entity.getDriverss().clear();
			for (DriverDTO drDto : dto.getDriverss()) {
				Driver drivers = driverRepository.getOne(drDto.getId());
				entity.getDriverss().add(drivers);			
			}
			entity.getClients().clear();
			for (ClientDTO drDto : dto.getClients()) {
				Client clients = clientRepository.getOne(drDto.getId());
				entity.getClients().add(clients);			
			}
			
			entity.getFleets().clear();
			for (FleetDTO drDto : dto.getFleets()) {
				Fleet fleets = fleetRepository.getOne(drDto.getId());
				entity.getFleets().add(fleets);			
			}
			entity.getRoutes().clear();
			for (RouteDTO drDto : dto.getRoutes()) {
				Route routes = routeRepository.getOne(drDto.getId());
				entity.getRoutes().add(routes);			
			}
		}

	}
