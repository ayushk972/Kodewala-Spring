package com.tapqwik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tapqwik.model.Payment;

@Component
public class PaymentServie {
	
	private final Payment payment;
	
	@Autowired
	public PaymentServie(Payment payment) {
		this.payment = payment;
	}
	
	public void placeOrder() {
		System.out.println("Customer is placing order...");
		payment.pay();
	}
}
