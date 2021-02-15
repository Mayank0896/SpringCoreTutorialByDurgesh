package com.springcore.LC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/LC/lcconfig.xml");
        System.out.println("Before getBean");
        Example obj = (Example) context.getBean("example");
        System.out.println("After getBean");

    }
}
