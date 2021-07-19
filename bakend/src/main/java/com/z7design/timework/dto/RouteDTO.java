package com.z7design.timework.dto;

import java.io.Serializable;

import com.z7design.timework.entities.Route;

public class RouteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String codeRoute;
			
	public RouteDTO() {
		
	}
	
	public RouteDTO(Long id, String name, String codeRoute) {
		super();
		this.id = id;
		this.name = name;
		this.codeRoute = codeRoute;
	}


	public RouteDTO(Route entity) {
			
			this.id = entity.getId();
			this.name = entity.getName();
			this.codeRoute = entity.getCodeRoute();
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


	public String getCodeRoute() {
		return codeRoute;
	}


	public void setCodeRoute(String codeRoute) {
		this.codeRoute = codeRoute;
	}

}
