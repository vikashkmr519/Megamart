package com.megamart.userservice.model;

public enum RoleBasedAuthority {
	
	ROLE_USER("USER"),
	ROLE_ADMIN("ADMIN");
	
	RoleBasedAuthority(String string) {
		this.role = string;
	}

	private final String role;
	
	

}
