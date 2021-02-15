package com.springcore.autowire.Annotations;

public class Address {
    private String street;
    private String city;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" + " street='" + getStreet() + "'" + ", city='" + getCity() + "'" + "}";
    }

}
