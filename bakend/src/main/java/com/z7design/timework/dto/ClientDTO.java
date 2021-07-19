package com.z7design.timework.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import com.z7design.timework.entities.Client;
import com.z7design.timework.entities.Route;

public class ClientDTO {
	
	private Long id;
	private String name;
	private String cpf;
	private String cnpj;
	private String razonSocial;
	private String email;
	private String imgUrl;
			
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dateRegister;
	
	private List<RouteDTO> routes = new ArrayList<>();
	

	public ClientDTO() {
		
	}


	public ClientDTO(Long id, String name, String cpf, String cnpj, Double income, String razonSocial, String email,
			Instant birthDate,String imgUrl, Instant dateRegister) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.razonSocial = razonSocial;
		this.email = email;
		this.imgUrl = imgUrl;
		this.dateRegister = dateRegister;

	}
	
	public ClientDTO(Client entity) {
		
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		cnpj = entity.getCnpj();
		razonSocial = entity.getRazonSocial();
		email = entity.getEmail();
		imgUrl = entity.getImgUrl();
		dateRegister = entity.getDateRegister();

	}

	public ClientDTO(Client entity, Set<Route> routes) {
		this(entity);
		routes.forEach(rt -> this.routes.add(new RouteDTO(rt)));
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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Instant getDateRegister() {
		return dateRegister;
	}


	public void setDateRegister(Instant dateRegister) {
		this.dateRegister = dateRegister;
	}


	public List<RouteDTO> getRoutes() {
		return routes;
	}


	public void setRoutes(List<RouteDTO> routes) {
		this.routes = routes;
	}
	
}
