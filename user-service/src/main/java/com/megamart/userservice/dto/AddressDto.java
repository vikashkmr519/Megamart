package com.megamart.userservice.dto;

import java.io.Serializable;

public class AddressDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer addressId;

	private String fullAddress;

	private String postalCode;

	private Integer userId;
	
	private String city;

	private UserDto userDto;

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

	public UserDto getUserDto() {
		return userDto;
	}

	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
