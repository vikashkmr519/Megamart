package com.megamart.userservice.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

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
@Transactional
public class AddressServiceImpl implements AddressService {

	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private AddressRepository addressRepo;

	@Override
	public List<AddressDto> findAll() {
		log.info("*** AddressDto list, Service ; fetch all address *");
		return addressRepo.findAll().stream().map(AddressMappingHelper::map).distinct()
				.collect(Collectors.toUnmodifiableList());

	}

	@Override
	public AddressDto findById(Integer addressId) {
		log.info("*** AddressDto, Service ; fetch address by id *");
		return addressRepo.findById(addressId).map(AddressMappingHelper::map)
				.orElseThrow(() -> new AddressNotFoundException(
						String.format("### Address with id : %d not found! ###", addressId)));
	}

	@Override
	public AddressDto save(AddressDto addressDto) {
		log.info("*** AddressDto, Service ; Saving Address *");
		Address address = AddressMappingHelper.map(addressDto);
		address.setCreatedAt(this.getCurrentTimeStamp());
		return AddressMappingHelper.map(this.addressRepo.save(address));
	}

	@Override
	public AddressDto update(AddressDto addressDto) {
		log.info("*** AddressDto, Service; update Address data *");
		Optional<Address> fetchedAddress = this.addressRepo.findById(addressDto.getAddressId());
		if (fetchedAddress.isEmpty()) {
			throw new AddressNotFoundException(
					String.format("### Address with id : %d not found! ###", addressDto.getAddressId()));
		} else {
			Address address = fetchedAddress.get();
			address.setCity(addressDto.getCity() == null ? fetchedAddress.get().getCity() : addressDto.getCity());
			address.setFullAddress(addressDto.getFullAddress() == null ? fetchedAddress.get().getFullAddress()
					: addressDto.getFullAddress());
			address.setPostalCode(addressDto.getPostalCode() == null ? fetchedAddress.get().getPostalCode()
					: addressDto.getPostalCode());
			address.setUpdatedAt(this.getCurrentTimeStamp());
			return AddressMappingHelper.map(this.addressRepo.save(address));
		}

	}

	@Override
	public void deleteById(Integer addressId) {
		log.info("*** Void, Service; delete address by address Id *");
		if (addressRepo.existsById(addressId)) {
			this.addressRepo.deleteById(addressId);
		}else {
			throw new AddressNotFoundException(String.format("### Address with id : %d not found! ###", addressId));
		}
	}

	private Timestamp getCurrentTimeStamp() {
		Date date = new Date();
		return new Timestamp(date.getTime());
	}
}
