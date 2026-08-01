package com.springbootcoredemo2.SpringBootCoreDemo2;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();

        System.out.println("Order placed successfully");
    }
}
