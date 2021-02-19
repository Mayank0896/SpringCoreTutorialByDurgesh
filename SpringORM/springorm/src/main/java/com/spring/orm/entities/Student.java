package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // to declare this class as entity
@Table(name = "student_details") // declaring it as entity of which table student_details
public class Student {
    @Id
    @Column(name = "student_id") // declare this property to column name student_id in table student_details
    private int studentId;
    @Column(name = "student_name")// declare this property to column name student_name in table student_details
    private String name;
    @Column(name = "student_city") // // declare this property to column name student_city in table student_details
    private String city;

    public Student(int studentId, String name, String city) {
        this.studentId = studentId;
        this.name = name;
        this.city = city;
    }

    public Student() {
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" + " studentId='" + getStudentId() + "'" + ", name='" + getName() + "'" + ", city='" + getCity() + "'"
                + "}";
    }

}
