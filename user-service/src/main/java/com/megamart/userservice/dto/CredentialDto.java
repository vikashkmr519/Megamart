package com.megamart.userservice.dto;

import java.io.Serializable;
import java.util.Set;

import com.megamart.userservice.model.RoleBasedAuthority;

public class CredentialDto implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Integer credentialId;
	
	private Integer userId;
	
	private String username;
	
	private String password;
	
	private RoleBasedAuthority roleBasedAuthority;
	
	private Boolean isEnabled;
	
	private Boolean isAccountNonExpired;
	
	private Boolean isAccountNonLocked;
	
	private Boolean isCredentialsNonExpired;
	
	private UserDto userDto;
	
	private Set<VerificationTokenDto> verificationTokenDtos;

	public Integer getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Integer credentialId) {
		this.credentialId = credentialId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleBasedAuthority getRoleBasedAuthority() {
		return roleBasedAuthority;
	}

	public void setRoleBasedAuthority(RoleBasedAuthority roleBasedAuthority) {
		this.roleBasedAuthority = roleBasedAuthority;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Boolean getIsAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public Boolean getIsCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public Set<VerificationTokenDto> getVerificationTokenDtos() {
		return verificationTokenDtos;
	}

	public void setVerificationTokenDtos(Set<VerificationTokenDto> verificationTokenDtos) {
		this.verificationTokenDtos = verificationTokenDtos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
