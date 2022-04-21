package com.megamart.orderservice.dto;

import java.util.Set;



public class CartDto {

	private Integer cartId;
	private Integer userId;
	private Set<OrderDto> orderDtos;
	private UserDto userDto;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Set<OrderDto> getOrderDtos() {
		return orderDtos;
	}
	public void setOrderDtos(Set<OrderDto> orderDtos) {
		this.orderDtos = orderDtos;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	
}
