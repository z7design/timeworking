package com.z7design.timework.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "tb_driver")
	public class Driver implements Serializable {
		private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

	private String name;
	private String imgUrl;
	private String celphone;
	private String email;
	private String cep;
	private String cnh;
	private String rg;
	private String cpf;
	
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<Driver> driver = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "tb_driver_fleet",
	joinColumns = @JoinColumn(name = "driver_id"),
	inverseJoinColumns = @JoinColumn(name = "fleet_id"))
	Set<Fleet> fleets = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name = "tb_driver_route",
	joinColumns = @JoinColumn(name = "driver_id"),
	inverseJoinColumns = @JoinColumn(name = "route_id"))
	Set<Route> routes = new HashSet<>();

	public Driver() {
		
	}
	public Driver(Long id, String name, String imgUrl, String celphone, String email, String cep, String cnh, String rg,
			String cpf, List<Driver> driver) {
		super();
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.celphone = celphone;
		this.email = email;
		this.cep = cep;
		this.cnh = cnh;
		this.rg = rg;
		this.cpf = cpf;
		this.driver = driver;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getCelphone() {
		return celphone;
	}


	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCnh() {
		return cnh;
	}


	public void setCnh(String cnh) {
		this.cnh = cnh;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public List<Driver> getDriver() {
		return driver;
	}
	
	
	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}


	public Set<Fleet> getFleets() {
		return fleets;
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
		Driver other = (Driver) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
