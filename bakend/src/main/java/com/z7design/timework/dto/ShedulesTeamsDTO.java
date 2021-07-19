package com.z7design.timework.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.z7design.timework.entities.Client;
import com.z7design.timework.entities.Driver;
import com.z7design.timework.entities.Fleet;
import com.z7design.timework.entities.Route;
import com.z7design.timework.entities.ShedulesTeams;

public class ShedulesTeamsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String hoursInitial;
	private String hoursFinish;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Date dateRegister;
	
	private String shift;
	private String inputType;
	private String outputType;
	
	private List<DriverDTO> driverss = new ArrayList<>();
	private List<FleetDTO> fleets = new ArrayList<>();
	private List<ClientDTO> clients = new ArrayList<>();
	private List<RouteDTO> routes = new ArrayList<>();

	public ShedulesTeamsDTO() {	
	}
	
	public ShedulesTeamsDTO(Long id, String hoursInitial, String hoursFinish, String shift, Date dateRegister, String inputType, String outputType ) {

		this.id = id;
		this.hoursInitial = hoursInitial;
		this.hoursFinish = hoursFinish;
		this.shift = shift;
		this.dateRegister = dateRegister;
		this.inputType = inputType;
		this.outputType = outputType;
	}
	
	public ShedulesTeamsDTO(ShedulesTeams entity) {
		this.id = entity.getId();
		this.hoursInitial = entity.getHoursInitial();
		this.hoursFinish = entity.getHoursFinish();
		this.shift = entity.getShift();
		this.dateRegister = entity.getDateRegister();
		this.inputType = entity.getInputType();
		this.outputType = entity.getOutputType();
	}
	
	public ShedulesTeamsDTO(ShedulesTeams entity, Set<Driver> driverss, Set<Fleet> fleets, Set<Client> clients, Set<Route> routes) {
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
	
	public String getHoursInitial() {
		return hoursInitial;
	}

	public void setHoursInitial(String hoursInitial) {
		this.hoursInitial = hoursInitial;
	}

	public String getHoursFinish() {
		return hoursFinish;
	}

	public void setHoursFinish(String hoursFinish) {
		this.hoursFinish = hoursFinish;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Date getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}
	
	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public List<DriverDTO> getDriverss() {
		return driverss;
	}

	public void setDriverss(List<DriverDTO> driverss) {
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

}
