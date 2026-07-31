package com.beaninitialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype")
public class OrderService {

    PaymentService paymentService;
    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Order service created.");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }

    public void getOrderDetails(){
        System.out.println("Order details ");
    }
}
