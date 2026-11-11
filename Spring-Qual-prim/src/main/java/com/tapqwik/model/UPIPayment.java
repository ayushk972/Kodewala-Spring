package com.tapqwik.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPIPayment implements Payment {
	
	public void pay() {
		System.out.println("Payment Done By UPI...");
	}
}
