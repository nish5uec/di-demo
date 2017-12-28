package com.sharma.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "hello world!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
