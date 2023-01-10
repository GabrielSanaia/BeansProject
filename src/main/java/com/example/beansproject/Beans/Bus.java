package com.example.beansproject.Beans;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Vehicle{

    @Override
    public void move(){
        System.out.println("Bus is moving");
    }
}
