package com.z7design.timework.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.z7design.timework.entities.Driver;
import com.z7design.timework.entities.Fleet;

public class DriverDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String imgUrl;
	private String celphone;
	private String email;
	private String cep;
	private String cnh;
	private String rg;
	private String cpf;
			
	private List<FleetDTO> fleets = new ArrayList<>();
	
	public DriverDTO() {
	}
	
	public DriverDTO(Long id, String name, String imgUrl, String celphone, String email, String cep, String cnh,
			String rg, String cpf) {
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
	}

	public DriverDTO(Driver entity) {
			
			id = entity.getId();
			name = entity.getName();
			imgUrl = entity.getImgUrl();
			celphone = entity.getCelphone();
			email = entity.getEmail();
			cep = entity.getCep();
			cnh = entity.getCnh();
			rg = entity.getRg();
			cpf = entity.getCpf();

		}
	
	public DriverDTO(Driver entity, Set<Fleet> fleets) {
		this(entity);
		fleets.forEach(flee -> this.fleets.add(new FleetDTO(flee)));
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


	public List<FleetDTO> getFleets() {
		return fleets;
	}


	public void setFleets(List<FleetDTO> fleets) {
		this.fleets = fleets;
	}
	
}
