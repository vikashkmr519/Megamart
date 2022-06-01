package com.megamart.userservice.helper;

import com.megamart.userservice.dto.UserDto;
import com.megamart.userservice.model.User;

public class UserMappingHelper {

	public static UserDto map(final User user) {
		UserDto dto = new UserDto();
		dto.setEmail(user.getEmail());
		dto.setFirstName(user.getFirstName());
		dto.setImageUrl(user.getImageUrl());
		dto.setLastName(user.getLastName());
		dto.setPhone(user.getPhone());
		return dto;
	}
	
	public static User map(final UserDto dto) {
		User user = new User();
		user.setEmail(dto.getEmail());
		user.setFirstName(dto.getFirstName());
		user.setImageUrl(dto.getImageUrl());
		user.setLastName(dto.getLastName());
		user.setPhone(dto.getPhone());
		return user;
	}
}
