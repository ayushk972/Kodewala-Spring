package com.tapqwik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tapqwik.Config.SpringConfig;
import com.tapqwik.service.PaymentServie;
import com.tapqwik.service.RefundPaymentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Main Method Start...");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		PaymentServie p1 = context.getBean(PaymentServie.class);
		p1.placeOrder();
		
		RefundPaymentService r1 = context.getBean(RefundPaymentService.class);
		r1.refund();
	}
}
