package com.codeclan.BookingSystem.repositories.customerRepository;

import com.codeclan.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

<<<<<<< HEAD
    List<Customer> findCustomersByCourse(Long Id);
=======
//    List<Customer> findByCourse_id(Long Id);
>>>>>>> 2f37ec0f851f1c38432fe0171607a54c2823c6f4

}
