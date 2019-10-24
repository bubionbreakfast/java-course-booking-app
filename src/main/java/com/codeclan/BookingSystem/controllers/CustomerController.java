package com.codeclan.BookingSystem.controllers;

import com.codeclan.BookingSystem.models.Customer;
import com.codeclan.BookingSystem.repositories.courseRepository.CourseRepository;
import com.codeclan.BookingSystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping(value = "/customers")
=======
@RequestMapping(value="/customers")
>>>>>>> 2f37ec0f851f1c38432fe0171607a54c2823c6f4
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

<<<<<<< HEAD
    @GetMapping(value = "/course/{Id}")
    public List<Customer> findCustomersByCourse(@PathVariable Long Id){
        return customerRepository.findCustomersByCourse(Id);
    }
=======
//    @GetMapping(value="/course/{id}")
//    public List<Customer> findByCourse_id(@PathVariable Long Id) {
//        return customerRepository.findByCourse_id(Id);
//    }
>>>>>>> 2f37ec0f851f1c38432fe0171607a54c2823c6f4

}
