package com.z7design.timework.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Escala principal
@Entity
@Table(name = "tb_shedules_teams")
public class ShedulesTeams implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hoursInitial;
	private String hoursFinish;
	private String shift;
	private String inputType;
	private String outputType;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Date dateRegister;
	

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_shedules_teams_driver",
	joinColumns = @JoinColumn(name = "shedules_teams_id"),
	inverseJoinColumns = @JoinColumn(name = "driver_id"))
	Set<Driver> driverss = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_shedules_teams_fleet",
	joinColumns = @JoinColumn(name = "shedules_teams_id"),
	inverseJoinColumns = @JoinColumn(name = "fleet_id"))
	Set<Fleet> fleets = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_shedules_teams_client",
	joinColumns = @JoinColumn(name = "shedules_teams_id"),
	inverseJoinColumns = @JoinColumn(name = "client_id"))
	Set<Client> clients = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_shedules_teams_route",
	joinColumns = @JoinColumn(name = "shedules_teams_id"),
	inverseJoinColumns = @JoinColumn(name = "route_id"))
	Set<Route> routes = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name = "fleet_id")
	private Fleet fleet;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
		
	@ManyToOne
	@JoinColumn(name = "route_id")
	private Route route;
	
	public ShedulesTeams() {
		
	}

	public ShedulesTeams(Long id, String hoursInitial, String hoursFinish, Date dateRegister, String shift, String inputType, String outputType, Driver driver,
			Fleet fleet, Client client, Route route) {
		super();
		this.id = id;
		this.hoursInitial = hoursInitial;
		this.hoursFinish = hoursFinish;
		this.dateRegister = dateRegister;
		this.shift = shift;
		this.inputType = inputType;
		this.outputType = outputType;
		this.driver = driver;
		this.fleet = fleet;
		this.client = client;
		this.route = route;
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

	public Date getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
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


	public Driver getDriver() {
		return driver;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public Client getClient() {
		return client;
	}

	public Route getRoute() {
		return route;
	}

	public Set<Driver> getDriverss() {
		return driverss;
	}


	public Set<Fleet> getFleets() {
		return fleets;
	}
	

	public Set<Client> getClients() {
		return clients;
	}


	public Set<Route> getRoutes() {
		return routes;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShedulesTeams other = (ShedulesTeams) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}