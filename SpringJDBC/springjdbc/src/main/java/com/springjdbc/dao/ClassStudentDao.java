package com.springjdbc.dao;

import com.springjdbc.entities.Student;

import java.util.List;

import com.springjdbc.dao.RowMapperImp;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ClassStudentDao {

    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String query = "insert into student(id, name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return r;
    }

    public int change(Student student) {
        // updating query in table.
        String query = "update student set name=?, city=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return r; // it is equal to number of rows changed.
    }

    public int delete(Student student) {
        // updating query in table.
        String query = "delete from student where id=?";
        int r = this.jdbcTemplate.update(query, student.getId());
        return r; // it is equal to number of rows deleted. 0 if not found.
    }

    public Student getStudent(int studentId) { // function to get 1 row for particular id only
        String query = "select * from student where id = ?";
        RowMapper<Student> rowMapper = new RowMapperImp();
        Student obj = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

        return obj;
    }

    public List<Student> getAllStudents() {
        // selection all students
        String query = "select * from student";
        List<Student> students= this.jdbcTemplate.query(query, new RowMapperImp());// since there are no arguments so we will use this option
        // otherwise we will use below one....
        // this.jdbcTemplate.query(query, new RowMapperImp(),arg1,arg2,....);
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
