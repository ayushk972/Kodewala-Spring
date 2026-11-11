package com.spring.scope.springcofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.scope.model.Payment;

@Component
public class SpringConfig {
	
	@Bean("p1")
	@Scope("singleton")
	public Payment payment() {
		return new Payment();
	}
}
