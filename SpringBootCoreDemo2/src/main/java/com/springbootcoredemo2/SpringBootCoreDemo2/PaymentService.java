package com.springbootcoredemo2.SpringBootCoreDemo2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {


    public void pay(){
        System.out.println("Payment Done");
    }
}
