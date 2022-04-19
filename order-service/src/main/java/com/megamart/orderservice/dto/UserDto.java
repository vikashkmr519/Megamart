package com.megamart.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String email;
	private String phone;
	private Integer cartId;
	private CartDto cartDto;

}
