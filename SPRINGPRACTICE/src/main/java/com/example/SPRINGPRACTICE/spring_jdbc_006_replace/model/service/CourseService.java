package com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.service;

import com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.Course;
import com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.dao.CourseDao;

import java.util.List;

public class CourseService {


    //@Autowired
    private CourseDao courseDao;

    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void add(Course course) {
        courseDao.add(course);
    }

    public void update(Course course) {
        courseDao.update(course);
    }

    public void delete(Course course) {
        courseDao.delete(course);
    }

    public Course findById(int id) {
        return courseDao.findById(id);
    }

    public List<Course> findAll() {
        return courseDao.findAll();
    }
}
