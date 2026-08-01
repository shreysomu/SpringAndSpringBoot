package com.xmlbasedconfigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //get bean by id/name
       // OrderService orderService = (OrderService) context.getBean("orderService");

        //get bean by type
      //  OrderService orderService1 = context.getBean(OrderService.class);
       // orderService.orderPlace();
     //   orderService1.orderPlace();

//        OrderService orderService2 = context.getBean("orderService" ,OrderService.class);
//        orderService2.orderPlace();

        UserService userService = context.getBean(UserService.class);
//        System.out.println(userService.getUserNames());
        context.close();
    }
}