package com.codeclan.BookingSystem.controllers;

import com.codeclan.BookingSystem.models.Course;
import com.codeclan.BookingSystem.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping(value = "/courses")
=======
@RequestMapping(value="/courses")
>>>>>>> 2f37ec0f851f1c38432fe0171607a54c2823c6f4
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

<<<<<<< HEAD
    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }
=======
    @GetMapping(value="/rating/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

>>>>>>> 2f37ec0f851f1c38432fe0171607a54c2823c6f4
}
