package com.springjdbc.dao;

import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.springjdbc.entities.Student;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException { 
        // It is a better approach than using anonymous class because, here we hava write
        // code only once and using anonymous class we have to write it again and again for each query.
        // this funtion will be same for returning single or multiple rows.
        // TODO Auto-generated method stub
        Student obj  = new Student();
        obj.setId(rs.getInt(1));
        obj.setName(rs.getString(2));
        obj.setCity(rs.getString(3));
     
        // System.out.println(rowNum); 

        return obj;
    }

}
