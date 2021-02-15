package com.springcore.lifecycle;

public class Samosa {
    private Double price;

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        System.out.println("setting property");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    
    public void init() throws Exception {
        System.out.println("Inside init");
    }

    
    public void destroy()throws Exception {
        System.out.println("Inside destroy");
    }

    @Override
    public String toString() {
        return "{" + " price='" + getPrice() + "'" + "}";
    }

}
