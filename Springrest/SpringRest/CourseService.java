package com.example.sprigHello.services;

import com.example.sprigHello.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();


    public Course getCourse(long courseId);

    public Course addCourse(Course course);
}
