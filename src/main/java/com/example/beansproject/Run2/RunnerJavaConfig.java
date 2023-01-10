package com.example.beansproject.Run2;

import com.example.beansproject.Beans2.Test1;
import com.example.beansproject.Config2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class RunnerJavaConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config2.class);


        Test1 test1 = context.getBean("test1", Test1.class);

        test1.injectTest2();
    }
}
