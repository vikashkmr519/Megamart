package com.megamart.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megamart.userservice.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
