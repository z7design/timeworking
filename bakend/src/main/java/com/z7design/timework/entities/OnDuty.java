package com.z7design.timework.entities;
import java.io.Serializable;
import java.sql.Time;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.Table;

@Entity
@Table(name = "tb_onduty")
public class OnDuty implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Time hoursInitial;
	private Time hoursFinish;
	private String shift;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dateRegister;

	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_onduty_driver",
	joinColumns = @JoinColumn(name = "onduty_id"),
	inverseJoinColumns = @JoinColumn(name = "driver_id"))
	Set<Driver> driverss = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Driver drivers;
	
	@ManyToOne
	@JoinColumn(name = "fleet_id")
	private Fleet fleet;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_onduty_fleet",
	joinColumns = @JoinColumn(name = "onduty_id"),
	inverseJoinColumns = @JoinColumn(name = "fleet_id"))
	Set<Fleet> fleets = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
		
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_onduty_client",
	joinColumns = @JoinColumn(name = "onduty_id"),
	inverseJoinColumns = @JoinColumn(name = "client_id"))
	Set<Client> clients = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "route_id")
	private Route route;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_onduty_route",
	joinColumns = @JoinColumn(name = "onduty_id"),
	inverseJoinColumns = @JoinColumn(name = "route_id"))
	Set<Route> routes = new HashSet<>();


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

	public Instant getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Instant dateRegister) {
		this.dateRegister = dateRegister;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Driver getDriver() {
		return drivers;
	}

	public void setDriver(Driver drivers) {
		this.drivers = drivers;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Set<Driver> getDriverss() {
		return driverss;
	}

	public void setDriverss(Set<Driver> driverss) {
		this.driverss = driverss;
	}

	public Set<Fleet> getFleets() {
		return fleets;
	}
	

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	

	public Set<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
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
		OnDuty other = (OnDuty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
