package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //--> /hello    //end Point
    // --> /orders

    @GetMapping("hello")
    public String  hello(){
        return "<h1>Namaste Duniya </h1>";
    }

    @GetMapping("bye")
    public String greetBye(){
        return "<h2>Bye</h2>";
    }
}
