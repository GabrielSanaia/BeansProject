package com.example.beansproject.Run2;

import com.example.beansproject.Beans2.Test1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerXML {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAware.xml");

        Test1 test1 = context.getBean("test1", Test1.class);

        test1.injectTest2();

    }
}
