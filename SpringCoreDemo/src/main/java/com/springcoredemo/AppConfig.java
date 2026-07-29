package com.springcoredemo;

import com.springcoredemo.payment.CardPayment;
import com.springcoredemo.payment.PaymentService;
import com.springcoredemo2.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcoredemo")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Somu",26);
    }
    @Bean
    public CartService createCartService(){
        return new CartService();
    }

    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
