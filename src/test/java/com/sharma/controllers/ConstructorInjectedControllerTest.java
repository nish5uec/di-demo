package com.sharma.controllers;

import com.sharma.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void test(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_WORLD,constructorInjectedController.sayHello());
    }
}
