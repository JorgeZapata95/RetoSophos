package com.google.www.model.enums;

public enum ServiceAssets {
	BASE_ENDPOINT("https://gorest.co.in/"),
	GET_USERS("public-api/users"),
	AUTHORIZATION("RWqo0uakESK-WVYiJ3vYTQIh3YvDFGWufrNw")
	;
	
	private String value;
	
	private ServiceAssets(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	 
	
	
}
