package com.megamart.orderservice.model;

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
@Table(name="carts")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Cart extends AbstractMappedEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "cart_id", unique = true, nullable = false, updatable = false)
	private Integer cartId;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "order_id")
	private Integer orderId;

}
