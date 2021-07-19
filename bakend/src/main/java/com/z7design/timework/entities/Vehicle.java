package com.z7design.timework.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "tb_vehicle")
	public class Vehicle implements Serializable {
		private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private String kmActualy;
	private String prefix;
	private String chassis;
	private String plate;
	private String locality;
	private String armchairs;
	private String brand;
	private String model;
	private String carIsurance;
	private String policy;
	private String secureExpiration;
	private String acessory;
	private String image;
	private String fleet;
	
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant date;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;
	
	public Vehicle() {		
	}

	public Vehicle(Long id, String description, String kmActualy, String prefix, String chassis, String plate,
			String locality, String armchairs, String brand, String model, String carIsurance, String policy,
			String secureExpiration, String acessory, String image, Instant date, Instant createdAt,
			Instant updatedAt, String fleet) {
		super();
		this.id = id;
		this.description = description;
		this.kmActualy = kmActualy;
		this.prefix = prefix;
		this.chassis = chassis;
		this.plate = plate;
		this.locality = locality;
		this.armchairs = armchairs;
		this.brand = brand;
		this.model = model;
		this.carIsurance = carIsurance;
		this.policy = policy;
		this.secureExpiration = secureExpiration;
		this.acessory = acessory;
		this.image = image;
		this.date = date;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.fleet = fleet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKmActualy() {
		return kmActualy;
	}

	public void setKmActualy(String kmActualy) {
		this.kmActualy = kmActualy;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getArmchairs() {
		return armchairs;
	}

	public void setArmchairs(String armchairs) {
		this.armchairs = armchairs;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarIsurance() {
		return carIsurance;
	}

	public void setCarIsurance(String carIsurance) {
		this.carIsurance = carIsurance;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getSecureExpiration() {
		return secureExpiration;
	}

	public void setSecureExpiration(String secureExpiration) {
		this.secureExpiration = secureExpiration;
	}

	public String getAcessory() {
		return acessory;
	}

	public void setAcessory(String acessory) {
		this.acessory = acessory;
	}

	public String getImgage() {
		return image;
	}

	public void setImgage(String imgage) {
		this.image = imgage;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getFleet() {
		return fleet;
	}

	public void setFleet(String fleet) {
		this.fleet = fleet;
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
		Vehicle other = (Vehicle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
