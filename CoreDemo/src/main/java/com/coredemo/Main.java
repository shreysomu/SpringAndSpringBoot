package com.coredemo;

import com.coredemo.notification.EmailService;
import com.coredemo.notification.NotificationService;
import com.coredemo.notification.SmsService;

public class Main {
    public static void main(String[] args) {

        NotificationService notification = new EmailService();
        //Injecting through constructor
        OrderService order = new OrderService(notification);

        OrderService order1 = new OrderService();

        //Injecting through setter method
        order1.setNotification(notification);
        order.placeOrder();
        order1.placeOrder();
    }
}
//A class should ask what it needs , not
//Build everything itself