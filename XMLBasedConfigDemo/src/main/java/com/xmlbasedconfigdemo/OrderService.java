package com.xmlbasedconfigdemo;

import com.xmlbasedconfigdemo.payment.PaymentService;

public class OrderService {

    private PaymentService paymentService;

    //Constructor injection
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //Setter Injection

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void orderPlace(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
