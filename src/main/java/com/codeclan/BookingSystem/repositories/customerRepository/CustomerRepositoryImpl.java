package com.codeclan.BookingSystem.repositories.customerRepository;

import com.codeclan.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourse(Long Id){
        String aliasBookingsString = "aliasBookings";
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Customer.class);
            criteria.createAlias("bookings", "booking");
            criteria.createAlias("booking.course", "course");
            criteria.add(Restrictions.eq("course.Id", Id));
            results =criteria.list();
        }
        catch (HibernateException exception){
            exception.printStackTrace();
        }
        return results;
    }

}
