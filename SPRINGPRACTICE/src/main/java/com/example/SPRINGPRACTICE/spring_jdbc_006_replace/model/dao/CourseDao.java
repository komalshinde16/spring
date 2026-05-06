package com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.dao;

import com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.model.Course;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CourseDao {

    //@Autowired
    private JdbcTemplate jdbcTemplate;

    public CourseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(Course course) {
        String query = "insert into course(name,duration,price,description) values(?,?,?,?)";
        jdbcTemplate.update(query, course.getName(), course.getDuration(), course.getPrice(), course.getDescription());
        System.out.println("Course added");
    }

    public void update(Course course) {
        String query = "update course set name=?,duration=?,price=?,description=? where id=?";
        jdbcTemplate.update(query, course.getName(), course.getDuration(), course.getPrice(), course.getDescription(), course.getId());
        System.out.println("Course updated");
    }

    public void delete(Course course) {
        String query = "delete from course where id=?";
        jdbcTemplate.update(query, course.getId());
        System.out.println("Course deleted");
    }

    public Course findById(int id) {
        String query = "select * from course where id=?";
        return null;
    }

    public List<Course> findAll() {
        return null;
    }
}
