package com.springcore.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1") // it has name or id of bean
public class Student {
    @Value("Mayank Kumar") // value of studentName
    private String studentName;
    @Value("Muradnagar") // value of city
    private String city;
    @Value("#{listLL}")
    private List<String> address; // stores multiple address

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return this.address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" + " studentName='" + getStudentName() + "'" + ", city='" + getCity() + "'" + ", address='"
                + getAddress() + getAddress().getClass().getName() + "'" + "}";
    }

}
