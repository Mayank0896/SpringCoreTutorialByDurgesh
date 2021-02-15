package com.springcore.autowire.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    private Address address;

    public Address getAddress() {
        return this.address;
    }

    // @Autowired
    // @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" + " address='" + getAddress() + "'" + "}";
    }

}
