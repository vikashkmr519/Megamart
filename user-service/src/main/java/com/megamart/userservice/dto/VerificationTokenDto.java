package com.megamart.userservice.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.megamart.userservice.constants.AppConstant;

public class VerificationTokenDto implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Integer verificationTokenId;
	
	private String token;
	
	private Integer credentialId;
	
	@JsonFormat(pattern = AppConstant.LOCAL_DATE_FORMAT, shape = Shape.STRING)
	@DateTimeFormat(pattern = AppConstant.LOCAL_DATE_FORMAT)
	private LocalDate expireDate;
	
	private CredentialDto credentialDto;

	public Integer getVerificationTokenId() {
		return verificationTokenId;
	}

	public void setVerificationTokenId(Integer verificationTokenId) {
		this.verificationTokenId = verificationTokenId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Integer credentialId) {
		this.credentialId = credentialId;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public CredentialDto getCredentialDto() {
		return credentialDto;
	}

	public void setCredentialDto(CredentialDto credentialDto) {
		this.credentialDto = credentialDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
