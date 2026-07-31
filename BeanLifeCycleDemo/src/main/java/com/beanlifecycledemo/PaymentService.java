package com.beanlifecycledemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService(){
        System.out.println("PaymentService created");
    }

    public void pay(){
        System.out.println("Payment done");
    }
}
