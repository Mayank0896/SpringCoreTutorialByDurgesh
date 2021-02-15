package com.springcore.autowire.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/Annotations/awannconfig.xml");

        Emp obj = (Emp) context.getBean("emp");
        System.out.println(obj);

    }
}
