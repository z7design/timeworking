package com.z7design.timework.services.exceptions;

public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundException (String msg) {
		super(msg);
	}	
}
