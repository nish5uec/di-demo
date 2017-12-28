package com.sharma.controllers;

import com.sharma.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_WORLD,setterInjectedController.sayHello());
    }
}
