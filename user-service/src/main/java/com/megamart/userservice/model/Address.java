package com.megamart.userservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "address")
public final class Address extends AbstractMappedEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id", unique = true, nullable = false, updatable = false)
	private Integer addressId;
	
	@Column(name = "full_address", unique = true)
	private String fullAddress;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	private String city;
	
	
	@Column(name = "user_id")
	private Integer userId;


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getFullAddress() {
		return fullAddress;
	}


	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
