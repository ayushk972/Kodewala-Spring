package com.patment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.patment.model.Payment;

@Configuration
@ComponentScan(basePackages = "com.patment")
public class SpringConfig {
	
	@Bean("UPI")
	@Primary
	public Payment upi() {
		return new Payment("XYZ-UPI-98765");
	}
	
	@Bean("CARD")
	public Payment card() {
		return new Payment("ABC-CARD-654352");
	}
	
}
