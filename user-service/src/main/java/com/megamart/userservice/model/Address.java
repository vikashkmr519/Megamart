package com.megamart.userservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
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
	private User user;
	

}
