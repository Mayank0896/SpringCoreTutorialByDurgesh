package com.springcore.stereotypeannotations.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypeannotations/ref/sarefconfig.xml");
        Student obj = con.getBean("student1",Student.class);
        System.out.println(obj);
        // System.out.print(obj.getStudentId());
        System.out.println(obj.hashCode());

        Student obj2 = con.getBean("student1",Student.class);
        System.out.println(obj2.hashCode());
        obj.setStudentId(840);
        System.out.println(obj.getStudentId());
        System.out.println(obj2.getStudentId()); // changes will be reflected in the obj2 also.
    
    
    }
}
