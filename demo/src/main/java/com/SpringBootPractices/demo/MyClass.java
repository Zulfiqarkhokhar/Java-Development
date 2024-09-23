package com.SpringBootPractices.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @Autowired
    Dog myDog;
    @GetMapping("myApi")
    public String show(){
        return "Hello Zulfiqar Ali";
    }
    @GetMapping("dogApi")
    public String sound(){
        return myDog.makeSound();
    }
}
