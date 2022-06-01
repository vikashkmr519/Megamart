package com.megamart.userservice.config.client;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@SpringBootConfiguration
public class ClientConfig {

	
	@Bean
	public RestTemplate restTemplateBean() {
		return new RestTemplate();
	}
}
