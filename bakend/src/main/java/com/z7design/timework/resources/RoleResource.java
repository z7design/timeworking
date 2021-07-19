package com.z7design.timework.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.z7design.timework.dto.RoleDTO;
import com.z7design.timework.services.RoleService;

	
@RestController
@RequestMapping(value = "/roles")
public class RoleResource {
	
	@Autowired
	private RoleService service;
	
	@GetMapping
	public ResponseEntity<Page<RoleDTO>> findAll(Pageable pageable) {
		Page<RoleDTO> list = service.findAllPaged(pageable);
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<RoleDTO> findById(@PathVariable Long id) {
		RoleDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	@PostMapping
	public ResponseEntity<RoleDTO> insert(@RequestBody RoleDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<RoleDTO> update(@PathVariable Long id, @RequestBody RoleDTO dto){
		dto = service.update(id,dto);
		return ResponseEntity.ok().body(dto);
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<RoleDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
