package com.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.scope.model.Payment;
import com.spring.scope.springcofig.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("main method start");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Payment pay1 = (Payment) context.getBean("p1");
        pay1.payment("Ayush");
        
        Payment pay2 = (Payment) context.getBean("p1");
        
        System.out.println(pay1 == pay2);
    }
}
