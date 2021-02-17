package com.springcore.stereotypeannotations.ref;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student1")
@Scope("prototype")
public class Student {
    @Value("420")
    private int studentId;
    @Value("#{address1}") // It is id of Address class. It also not declared in XML file
    private Address address;
    @Value("#{8>4}")
    private boolean result;

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

    public boolean isResult() {
        return this.result;
    }

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{" + " studentId='" + getStudentId() + "'" + ", address='" + getAddress() + "'" + ", result='"
                + isResult() + "'" + "}";
    }

}
