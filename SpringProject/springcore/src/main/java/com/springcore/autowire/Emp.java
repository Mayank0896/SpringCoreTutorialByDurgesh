package com.springcore.autowire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
        super();
    }

    public Emp(Address address) {
        super();
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" + " address='" + getAddress() + "'" + "}";
    }

}
