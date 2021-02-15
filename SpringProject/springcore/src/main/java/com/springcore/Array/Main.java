package com.springcore.Array;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Array/arrconfig.xml");
        Person obj = (Person) context.getBean("person");
        System.out.println(obj);

    }

}
