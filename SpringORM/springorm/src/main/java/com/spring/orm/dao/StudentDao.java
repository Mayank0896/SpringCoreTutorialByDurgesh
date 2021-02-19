package com.spring.orm.dao;
//It is the dao class that uses HibernateTemplate.(data access object). It has all the functions to access Data

import javax.transaction.Transactional;

import com.spring.orm.entities.Student;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.*;

public class StudentDao {

    private HibernateTemplate hibernateTemplate; // used to access functions of HibernateTemplate class

    @Transactional // for writing access only
    public int insert(Student student) {
        // insert the object student to table

        int result = (int) this.hibernateTemplate.save(student);
        return result;
    }

    // get the single row or object
    public Student getStudent(int id) {
        Student student = this.hibernateTemplate.get(Student.class, id);
        return student;
    }

    // get all rows or objects
    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> list = (ArrayList<Student>) this.hibernateTemplate.loadAll(Student.class);
        return list;
    }

    // deleting the rows
    public void deleteStudent(int id) {
        Student student = this.hibernateTemplate.get(Student.class, id);
        this.hibernateTemplate.delete(student);
        return;
    }

    // updating data or rows
    public void updateStudent(int id) {
        Student student = this.hibernateTemplate.get(Student.class, id);
        this.hibernateTemplate.update(student);
        return;
    }

    public HibernateTemplate getHibernateTemplate() {
        return this.hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDao() {
    }

    @Override
    public String toString() {
        return "StudentDao [hibernateTemplate=" + hibernateTemplate + "]";
    }

}
