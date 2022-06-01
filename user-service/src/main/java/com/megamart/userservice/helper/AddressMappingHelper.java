package com.megamart.userservice.helper;

import com.megamart.userservice.dto.AddressDto;
import com.megamart.userservice.model.Address;

public class AddressMappingHelper {

	public static Address map(final AddressDto dto) {
		Address adrs = new Address();
		adrs.setAddressId(dto.getAddressId());
		adrs.setCity(dto.getCity());
		adrs.setFullAddress(dto.getFullAddress());
		adrs.setPostalCode(dto.getPostalCode());
		adrs.setUserId(dto.getUserId());
		return adrs;
	}
	
	
	public static AddressDto map(final Address adrs) {
		AddressDto  dto = new AddressDto();
		dto.setAddressId(adrs.getAddressId());
		dto.setCity(adrs.getCity());
		dto.setFullAddress(adrs.getFullAddress());
		dto.setPostalCode(adrs.getPostalCode());
		dto.setUserId(adrs.getUserId());
		return dto;
	}
}
