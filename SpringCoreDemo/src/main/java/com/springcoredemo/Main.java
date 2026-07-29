package com.springcoredemo;

import com.springcoredemo2.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        CartService cartService = new CartService();
//        cartService.addToCart();

        User user = context.getBean(User.class);
        System.out.println(user.getName());

        CartService cartService = context.getBean(CartService.class);
        cartService.addToCart();
    }
}













//Reflection API

//class Student{
//    private String name;
//    private int age;
//
//    public Student(){
//
//    }
//
//    public void getAttendance(){
//
//    }
//
//    public void print(){
//
//    }
//}

//public static void main(String[] args) {
//    Student s1 = new Student();
//
//    //Class --->>Special class which hold metadata
//
//    Class<Student> c1 = Student.class; //c1 stores metadata of Student
//}