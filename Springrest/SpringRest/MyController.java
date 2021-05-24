package com.example.sprigHello.controller;

import com.example.sprigHello.entities.Course;
import com.example.sprigHello.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {
    @Autowired
	private CourseService courseService;

	@GetMapping(path = "/hello")
	public String hello() {
		return "welcome to intelij";
	}


	@GetMapping("/courses")
	public List<Course> getCources() {

		return this.courseService.getCourses();

	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course){
		return this.courseService.addCourse(course);
	}
}