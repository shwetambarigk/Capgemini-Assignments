package com.example.sprigHello.services;

import com.example.sprigHello.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"Spring Rest","Returning List..."));
        list.add(new Course(2, "Spring Boot","Spring Boot Application..."));
}
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c= null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
            return c;
        }
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }


}
