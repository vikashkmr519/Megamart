package com.megamart.orderservice.mapper;

import com.megamart.orderservice.dto.CartDto;
import com.megamart.orderservice.dto.UserDto;
import com.megamart.orderservice.model.Cart;

public interface CartMapper {
	
	public static CartDto map(final Cart cart) {
		CartDto dto = new CartDto();
		dto.setCartId(cart.getCartId());
		dto.setUserId(cart.getUserId());
		
		UserDto userDto = new UserDto();
		userDto.setUserId(cart.getUserId());
		
		dto.setUserDto(userDto);
		return dto;
		
	}

	public static Cart map(final CartDto dto) {
		Cart cart = new Cart();
		
		cart.setCartId(dto.getCartId());
		cart.setUserId(dto.getUserId());
		return cart;
	}
}
