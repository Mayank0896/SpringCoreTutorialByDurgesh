package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Student obj = new Student(10,"mayank","Muradnagar");
        // System.out.println(obj); // is is conventional method to create object of
        // class Student
        // we will use spring IOC to do that.

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");// this statement is only for onetime
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        System.out.println(student1.getStudentId());
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentAddress());
        
    }
}
