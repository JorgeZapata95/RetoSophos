package com.google.www.model.enums;

public enum ActorMemory {
	PRODUCT_NAME_ADDED("product_name"), SOUGHT_USER("sought_user");
	
	private String value;
	
	private ActorMemory(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
