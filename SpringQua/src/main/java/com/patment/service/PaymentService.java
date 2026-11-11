package com.patment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.patment.model.Payment;

@Component
public class PaymentService {
	
	@Autowired
	@Qualifier("CARD")
	Payment payment;
	
	public void doPayment() {
		payment.pay();
	}
}
