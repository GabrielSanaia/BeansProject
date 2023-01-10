package com.example.beansproject.Run1;

import com.example.beansproject.Beans.Car;
import com.example.beansproject.Beans.Person;
import com.example.beansproject.Beans.Vehicle;
import com.example.beansproject.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerJavaConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

        Car car = context.getBean("myCar", Car.class);

        Person person = context.getBean("person", Person.class);

//        System.out.println(vehicle);

//        System.out.println(car);

        System.out.println(person);

        person.getCar().move();
    }

}
