package com.tapqwik.model;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPayment implements Payment {
	public void pay() {
		System.out.println("Payment Done By NetBanking...");
	}

}
