package com.megamart.userservice.helper;

import com.megamart.userservice.dto.CredentialDto;
import com.megamart.userservice.model.Credential;

public class CredentialMappingHelper {
	
	public static CredentialDto  map(final Credential crd) {
	
		CredentialDto dto = new CredentialDto();
		dto.setCredentialId(crd.getCredentialId());
		dto.setIsAccountNonExpired(crd.getIsAccountNonExpired());
		dto.setIsAccountNonLocked(crd.getIsAccountNonLocked());
		dto.setIsCredentialsNonExpired(crd.getIsCredentialsNonExpired());
		dto.setIsEnabled(crd.getIsEnabled());
		dto.setPassword(crd.getPassword());
		dto.setRoleBasedAuthority(crd.getRoleBasedAuthority());
		dto.setUsername(crd.getUsername());
		dto.setUserId(crd.getUserId());
		return dto;
	}
	
	
	public static Credential map(final CredentialDto dto) {
		Credential crd = new Credential();
		crd.setCredentialId(dto.getCredentialId());
		crd.setIsAccountNonExpired(dto.getIsAccountNonExpired());
		crd.setIsAccountNonLocked(dto.getIsAccountNonLocked());
		crd.setIsCredentialsNonExpired(dto.getIsCredentialsNonExpired());
		crd.setIsEnabled(dto.getIsEnabled());
		crd.setPassword(dto.getPassword());
		crd.setRoleBasedAuthority(dto.getRoleBasedAuthority());
		crd.setUsername(dto.getUsername());
		crd.setUserId(dto.getUserId());
		return crd;
	}

}
