package com.beanlifecycledemo;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware /* DisposableBean implements InitializingBean */ {

    Map<Integer, String > mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("Cart Service constructor called");
    }
    public void addToCart(){
        System.out.println("Added to cart");
    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready : ");
//        mp.put(1,"Shrey");
//        mp.put(2,"Somu");
//    }

//    public void start(){
//        System.out.println("Bean is ready : ");
//        mp.put(1,"Shrey");
//        mp.put(2,"Somu");
//    }

    @PostConstruct
    public void start2(){
        System.out.println("Bean is ready : ");
        mp.put(1,"Shrey");
        mp.put(2,"Somu");
    }
    public String getValue(int key){
        return mp.get(key);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : " + name);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application contextName is  :" + applicationContext);
    }

//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

    @PreDestroy
    public void stop()  {
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }

//        public void stop()  {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }
}
