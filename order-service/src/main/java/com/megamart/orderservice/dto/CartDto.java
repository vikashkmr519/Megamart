package com.megamart.orderservice.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CartDto {

	private Integer cartId;
	private Integer userId;
	private Integer orderId;
	private Set<OrderDto> orderDtos;
	private UserDto userDto;
}
