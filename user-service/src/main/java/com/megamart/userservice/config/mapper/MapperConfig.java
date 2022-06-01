package com.megamart.userservice.config.mapper;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

@SpringBootConfiguration
public class MapperConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new JsonMapper()
				.enable(SerializationFeature.INDENT_OUTPUT);
	}

}
