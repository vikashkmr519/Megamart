package com.megamart.orderservice.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.megamart.orderservice.constants.AppConstant;


public class OrderDto {

	private Integer orderId;
	
	@DateTimeFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT)
	private LocalDateTime orderDate;
	private String orderDesc;
	private Double orderFee;
	private Integer cartId;
	private CartDto cartDto;
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
	public CartDto getCartDto() {
		return cartDto;
	}
	public void setCartDto(CartDto cartDto) {
		this.cartDto = cartDto;
	}
	
	
}
