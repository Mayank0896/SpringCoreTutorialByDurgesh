package com.springjdbc;

import java.util.List;

import com.springjdbc.dao.ClassStudentDao;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
        // JdbcTemplate template = con.getBean("jdbcTemplate", JdbcTemplate.class);
        // // insert query
        // // String query = "insert into student(id, name,city) values(222,'Durgesh
        // // Tiwari','Delhi)";
        // String query = "insert into student(id, name,city) values(?,?,?)";
        // int result = template.update(query, 420, "Mayank Singh", "Muradnagar");
        // System.out.print("number of rows inserted..."+result);

        // ClassStudentDao studentdao =
        // con.getBean("classStudentDao",ClassStudenDao.class);

        ClassStudentDao studentDao = con.getBean("classStudentDao", ClassStudentDao.class);

        // Student data = new Student();
        // data.setId(420);
        // data.setName("Abhishek Kumar");
        // data.setCity("Delhi");

        // int result = studentDao.delete(data);
        // System.out.println("student delete : " + result);
       
        Student student = studentDao.getStudent(4200); // getting single row details from table student
        // //  for particular id.
        System.out.println(student+"For single row only");
         
        List<Student> students = studentDao.getAllStudents();
        for(Student s : students){
            System.out.println(s);
        }
        


    }
}
