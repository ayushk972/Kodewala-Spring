package com.tapqwik.model;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements Payment {
	public void pay() {
		System.out.println("Payment Done By Card...");
	}

}
