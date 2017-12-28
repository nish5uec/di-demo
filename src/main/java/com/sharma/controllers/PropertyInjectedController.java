package com.sharma.controllers;


import com.sharma.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
