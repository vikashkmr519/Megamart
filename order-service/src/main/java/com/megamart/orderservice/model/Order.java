package com.megamart.orderservice.model;


import java.time.LocalDateTime;

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
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order extends AbstractMappedEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false, updatable = false)
	private Integer orderId;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	
	@Column(name = "order_desc")
	private String orderDesc;
	
	@Column(name = "order_fee", columnDefinition = "decimal")
	private Double orderFee;
	
	@Column( name = "cart_id")
	private Integer cartId;

}
