package com.example.beansproject.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCar")
public class Car extends Vehicle{

    //@Autowired
    private Vehicle vehicle;
    @Value("modelAnnotation")
    private String model;
    @Value("colorAnnotation")
    private String color;

    @Autowired
    public Car(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicle=" + vehicle +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
