package com.springcore.stereotypeannotations.ref;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address1")
public class Address {
    @Value("PA24 O.F Estate Muradnagar")
    private String street;
    @Value("Ghaziabad")
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

    @Override
    public String toString() {
        return "{" + " street='" + getStreet() + "'" + ", city='" + getCity() + "'" + "}";
    }

}
