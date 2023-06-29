package com.soetek.demo.repository;

import com.soetek.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository
        extends CrudRepository<Customer, Long> {
}
