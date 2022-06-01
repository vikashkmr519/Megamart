package com.megamart.userservice.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.megamart.userservice.constants.AppConstant;


@Entity
@Table(name = "verification_tokens")
public final class VerificationToken extends AbstractMappedEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "verification_token_id", unique = true, updatable = false, nullable= false)
	private Integer verificationTokenId;
	
	@Column(name = "verif_token")
	private String token;
	
	@JsonFormat(pattern = AppConstant.LOCAL_DATE_FORMAT, shape = Shape.STRING)
	@DateTimeFormat(pattern = AppConstant.LOCAL_DATE_FORMAT)
	@Column(name = "expire_date")
	private LocalDate expireDate;
	
	
	@Column(name = "credential_id")
	private Integer credentialId;


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


	public LocalDate getExpireDate() {
		return expireDate;
	}


	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}


	public Integer getCredentialId() {
		return credentialId;
	}


	public void setCredentialId(Integer credentialId) {
		this.credentialId = credentialId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
