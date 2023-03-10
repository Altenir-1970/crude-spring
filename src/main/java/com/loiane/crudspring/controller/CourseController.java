package com.loiane.crudspring.controller;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.model.Course;
import com.loiane.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
//@AllArgsConstructor

public class CourseController {

private final CourseRepository courseRepository;

public CourseController (CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
}

    @GetMapping
    public @ResponseBody List <Course> list() {
        return courseRepository.findAll();
    }  
}
