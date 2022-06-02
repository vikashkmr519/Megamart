package com.megamart.userservice.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megamart.userservice.dto.AddressDto;
import com.megamart.userservice.exception.wrapper.AddressNotFoundException;
import com.megamart.userservice.helper.AddressMappingHelper;
import com.megamart.userservice.model.Address;
import com.megamart.userservice.repo.AddressRepository;
import com.megamart.userservice.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private AddressRepository addressRepo; 
	
	@Override
	public List<AddressDto> findAll() {
		log.info("*** AddressDto list, Service ; fetch all address *");
		return addressRepo.findAll().stream()
		.map(AddressMappingHelper::map)
		.distinct()
		.collect(Collectors.toUnmodifiableList());
		
	}

	@Override
	public AddressDto findById(Integer addressId) {
		log.info("*** AddressDto, Service ; fetch address by id *");
		return addressRepo.findById(addressId)
				.map(AddressMappingHelper::map)
				.orElseThrow(()-> new  AddressNotFoundException(String.format("### Address with id : %d not found! ###",addressId)));
	}

	@Override
	public AddressDto save(AddressDto addressDto) {
		
		return null;
	}

	@Override
	public AddressDto update(AddressDto addressDto) {
		
		return null;
	}

	@Override
	public AddressDto update(Integer addressId, AddressDto addressDto) {
		
		return null;
	}

	@Override
	public void deleteById(Integer addressId) {
		
		
	}

}
