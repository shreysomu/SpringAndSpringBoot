package com.springcoredemo;

import com.springcoredemo.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    //Injecting through field
   // @Autowired
    private final PaymentService paymentService ;


    //Injecting through constructor
    @Autowired //If having one constructor not needed to write @Autowired
    public OrderService ( PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //Injecting through setter method


//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }



    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
