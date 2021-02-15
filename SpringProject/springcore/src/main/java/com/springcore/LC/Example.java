package com.springcore.LC;

public class Example {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "{" + " age='" + this.age + "'" + ", name='" + this.name + "'" + "}";
    }

    public Example(int age, String name) {
        System.out.println("Constructor calling");
        this.age = age;
        this.name = name;
    }

    // This method executes
    // automatically as the bean
    // is instantiated
    public void init() throws Exception {
        System.out.println("Bean HelloWorld has been " + "instantiated and I'm " + "the init() method");
    }

    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception {
        System.out.println("Conatiner has been closed " + "and I'm the destroy() method");
    }

}
