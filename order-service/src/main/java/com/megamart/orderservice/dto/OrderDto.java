package com.megamart.orderservice.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.megamart.orderservice.constants.AppConstant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderDto {

	private Integer orderId;
	
	@DateTimeFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT)
	private LocalDateTime orderDate;
	private String orderDesc;
	private Double orderFee;
	private Integer cartId;
	private CartDto cartDto;
}
