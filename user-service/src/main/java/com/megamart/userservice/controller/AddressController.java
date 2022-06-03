package com.megamart.userservice.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megamart.userservice.dto.AddressDto;

import com.megamart.userservice.service.AddressService;

@RestController
@RequestMapping(value ="/api/address")
public class AddressController {
	
	private static final Logger log = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService addressService;
	
	@GetMapping
	public ResponseEntity<List<AddressDto>> findAll(){
		log.info("*** AddressDto list, Controller ; fetch all address *");
		return ResponseEntity.ok(addressService.findAll());
	}
	
	@GetMapping("/{addressId}")
	public ResponseEntity<AddressDto> findById(
			@PathVariable("addressId")
			@NotBlank(message="Input must not be null")
			@Valid final String addressId ){
		log.info("*** addressDto, Controller ; fetch address by id *");
		return new ResponseEntity<>(this.addressService.findById(Integer.parseInt(addressId)), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<AddressDto> save(
			@RequestBody 
			@NotNull(message = "Input must not NULL") 
			@Valid final AddressDto addressDto) {
		log.info("*** AddressDto, resource; save address *");
		return ResponseEntity.ok(this.addressService.save(addressDto));
	}
	
}
