package com.codeclan.BookingSystem.components;

import com.codeclan.BookingSystem.models.Booking;
import com.codeclan.BookingSystem.models.Course;
import com.codeclan.BookingSystem.models.Customer;
import com.codeclan.BookingSystem.repositories.bookingRepository.BookingRepository;
import com.codeclan.BookingSystem.repositories.courseRepository.CourseRepository;
import com.codeclan.BookingSystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer dave = new Customer("Dave", "Dunkirk", 36);
        customerRepository.save(dave);

        Course ruby = new Course("Intro to Ruby", "Le Harve", 5);
        courseRepository.save(ruby);

        Booking booking01 = new Booking("12-09-75", ruby, dave);
        bookingRepository.save(booking01);


    }
}
