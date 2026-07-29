package com.coredemo;

import com.coredemo.notification.NotificationService;

public class FakeEmailService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Dummy Email Sent");
    }
}
