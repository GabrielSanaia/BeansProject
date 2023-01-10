package com.example.beansproject.Beans2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Test1 implements ApplicationContextAware {
    private Test2 test2;

    //@Autowired
    private ApplicationContext context;

    public void callTest1(){
        System.out.println("callTest1");
    }

    public void injectTest2(){
        test2 = context.getBean("test2", Test2.class);
        test2.callTest2();
    }

    public Test2 getTest2() {
        return test2;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
