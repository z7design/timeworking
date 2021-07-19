package com.z7design.timework.dto;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.z7design.timework.entities.Fleet;
import com.z7design.timework.entities.Route;

public class FleetDTO {
	
	private Long id;
	private String number;
	private String description;
	
	private List<RouteDTO> routes = new ArrayList<>();
		
	public FleetDTO() {
		
	}
	
	public FleetDTO(Long id, String number, String description) {
		this.id = id;
		this.number = number;
		this.description = description;
	}

	public FleetDTO(Fleet entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.description = entity.getDescription();
	}
	
	public FleetDTO(Fleet entity, Set<Route> routes) {
		this(entity);
		routes.forEach(rout -> this.routes.add(new RouteDTO(rout)));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<RouteDTO> getRoutes() {
		return routes;
	}
	
}
