package com.springcore.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotations/saconfig.xml");
        Student stu = con.getBean("student1",Student.class);
        System.out.println(stu);

        System.out.print(stu.hashCode());
    }
}
