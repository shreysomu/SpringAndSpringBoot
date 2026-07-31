package com.beaninitialization;

import com.sun.javaws.ui.ApplicationIconGenerator;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
      //  PaymentService paymentService = context.getBean(PaymentService.class);
        orderService.placeOrder();
    }
}