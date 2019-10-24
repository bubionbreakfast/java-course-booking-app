package com.codeclan.BookingSystem.repositories.customerRepository;

import com.codeclan.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    public List<Customer> findCustomersByCourse(Long Id);
}
