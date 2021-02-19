package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    { 
        // org.hibernate.dialect.MySQLDialect
        
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        StudentDao studentDao =  con.getBean("studentDao",StudentDao.class);
        Student student = new Student(487,"Durgesh In","Muradnagar");
        int result = studentDao.insert(student);
        System.out.println(result);
    }
}
