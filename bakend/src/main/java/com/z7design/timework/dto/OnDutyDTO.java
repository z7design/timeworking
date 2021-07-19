package com.z7design.timework.dto;

import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.z7design.timework.entities.Client;
import com.z7design.timework.entities.Driver;
import com.z7design.timework.entities.Fleet;
import com.z7design.timework.entities.OnDuty;
import com.z7design.timework.entities.Route;
import com.z7design.timework.entities.ShedulesTeams;

public class OnDutyDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Time hoursInitial;
	private Time hoursFinish;
	private String shift;
	private Instant dateRegister;
	
	private List<DriverDTO> driverss = new ArrayList<>();
	private List<FleetDTO> fleets = new ArrayList<>();
	private List<ClientDTO> clients = new ArrayList<>();
	private List<RouteDTO> routes = new ArrayList<>();
	
	public OnDutyDTO() {
	}

	
	public OnDutyDTO(Long id, Time hoursInitial, Time hoursFinish, String shift, Instant dateRegister) {

		this.id = id;
		this.hoursInitial = hoursInitial;
		this.hoursFinish = hoursFinish;
		this.shift = shift;
		this.dateRegister = dateRegister;
	}
	
	public OnDutyDTO(OnDuty entity) {
		this.id = entity.getId();
		this.hoursInitial = entity.getHoursInitial();
		this.hoursFinish = entity.getHoursFinish();
		this.shift = entity.getShift();
		this.dateRegister = entity.getDateRegister();
	}
	
	public OnDutyDTO(OnDuty entity, Set<Driver> driverss, Set<Fleet> fleets, Set<Client> clients, Set<Route> routes) {
		this(entity);
		driverss.forEach(dri -> this.driverss.add(new DriverDTO(dri)));
		fleets.forEach(fle -> this.fleets.add(new FleetDTO(fle)));
		clients.forEach(cli -> this.clients.add(new ClientDTO(cli)));
		routes.forEach(rout -> this.routes.add(new RouteDTO(rout)));

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Time getHoursInitial() {
		return hoursInitial;
	}

	public void setHoursInitial(Time hoursInitial) {
		this.hoursInitial = hoursInitial;
	}

	public Time getHoursFinish() {
		return hoursFinish;
	}

	public void setHoursFinish(Time hoursFinish) {
		this.hoursFinish = hoursFinish;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Instant getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Instant dateRegister) {
		this.dateRegister = dateRegister;
	}
	
	public List<DriverDTO> getDriverss() {
		return driverss;
	}

	public void setDrivers(List<DriverDTO> driverss) {
		this.driverss = driverss;
	}

	public List<FleetDTO> getFleets() {
		return fleets;
	}

	public void setFleets(List<FleetDTO> fleets) {
		this.fleets = fleets;
	}

	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}

	public List<RouteDTO> getRoutes() {
		return routes;
	}

	public void setRoutes(List<RouteDTO> routes) {
		this.routes = routes;
	}

	public void setDriverss(List<DriverDTO> driverss) {
		this.driverss = driverss;
	}
	
	
}
