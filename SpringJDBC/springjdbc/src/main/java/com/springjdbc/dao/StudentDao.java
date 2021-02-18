package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
    public Student getStudent(int studentId);// we will use this method to fetch single object using row mapper interface
    public List<Student> getAllStudents();
}
