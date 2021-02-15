package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.ApplicationContext;

// import javax.annotation.PostConstruct; 
// import javax.annotation.PreDestroy; 

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/lifecycle/lcconfig.xml");

        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);
        context.close();
        System.out.println("After destroy");

    }
}
