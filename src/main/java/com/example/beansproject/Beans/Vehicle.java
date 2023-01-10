package com.example.beansproject.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Vehicle {
    @Value("typeAnnotation")
    private String type;

    public void move(){
        System.out.println("Vehicle is moving...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                '}';
    }
}
