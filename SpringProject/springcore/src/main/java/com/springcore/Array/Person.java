package com.springcore.Array;

// import java.util.*;

public class Person {
    private int id;
    private String name;
    private String[] hobbies;

    public Person(int id, String name, String[] hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "{" + " id='" + this.id + "'" + ", name='" + this.name + "'" + ", hobbies='" + this.hobbies + "'" + "}";
    }

}
