package com.springcore.javaconfig;

import java.util.*;
import org.springframework.stereotype.Component;


public class Student {
    private int studentId;
    private Address address;
    private List<Integer> list;

    public Student() {
    }

    public Student(int studentId, Address address, List<Integer> list) {
        this.studentId = studentId;
        this.address = address;
        this.list = list;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getList() {
        return this.list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "{" + " studentId='" + getStudentId() + "'" + ", address='" + getAddress() + "'" + ", list='" + getList()
                + "'" + "}";
    }

}
