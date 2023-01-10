package com.example.beansproject.Run1;

import com.example.beansproject.Beans.Car;
import com.example.beansproject.Beans.Person;
import com.example.beansproject.Beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("config.xml");

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

        Car car = context.getBean("car", Car.class);

        Person person = context.getBean("person", Person.class);

//
//        System.out.println(vehicle);
//
//        System.out.println(car);
//
        System.out.println(person);
//
        person.getCar().move();

    }
}
