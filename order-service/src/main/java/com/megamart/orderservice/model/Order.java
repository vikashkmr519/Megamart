package com.megamart.orderservice.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
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

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Double getOrderFee() {
		return orderFee;
	}

	public void setOrderFee(Double orderFee) {
		this.orderFee = orderFee;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
	

}
