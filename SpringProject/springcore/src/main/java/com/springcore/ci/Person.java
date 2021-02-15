package com.springcore.ci;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    // don't create setters because we will be using constructor injection

    public Person(String name, int personId, Certi certi) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "{" + " name='" + this.name + "'" + ", personId='" + this.personId + "'" + ", certi='" + this.certi + "'"
                + "}";
    }

}
