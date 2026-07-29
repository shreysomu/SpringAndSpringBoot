package com.coredemo;

import com.coredemo.notification.EmailService;
import com.coredemo.notification.NotificationService;
import com.coredemo.notification.PopUpNotificationService;
import com.coredemo.notification.SmsService;

public class OrderService {

    NotificationService notification ;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public OrderService(){

    }
    public void placeOrder(){
        System.out.println("Order Placed");
        //actual business logic
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
