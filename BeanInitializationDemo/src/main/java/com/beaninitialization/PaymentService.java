package com.beaninitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope("prototype")
public class PaymentService {

    OrderService orderService;

    public PaymentService(OrderService orderService){
        this.orderService = orderService;
        System.out.println("Payment service created.");
    }

    public void pay(){
        System.out.println("Payment done");
        orderService.getOrderDetails();
    }
}
