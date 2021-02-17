package com.springcore.javaconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // This class is handling our configuration that we used to do using xml file

public class javaConfig {
    @Bean // in this case by default name or id of bean would be getArrayList which we can use with getBean() method
    public List<Integer> getArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        return list;
    }

    @Bean(name = {"address","getAddress"}) // it accepts a single string or an array of string as shown 
    // these names are used as bean id or name with getBean() method 
    public Address getAddress() {
        Address add = new Address();

        return add;
    }

    @Bean(name = {"student1"})
    @Scope("prototype")
    public Student getStudent() {
        // using getter injection, we can use constructor injection as well
        Student obj = new Student();

        obj.setStudentId(420);
        obj.setAddress(getAddress()); // special way to call function getAddress which return object of Address clas
        obj.setList(getArrayList());// 

        return obj;
    }
}
