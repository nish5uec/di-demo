package com.sharma.controllers;


import com.sharma.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
