package com.beanlifecycledemo;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        System.out.println("Order placed successfully");
        paymentService.pay();
    }


}
