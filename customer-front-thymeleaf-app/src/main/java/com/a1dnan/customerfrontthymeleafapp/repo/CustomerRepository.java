package com.a1dnan.customerfrontthymeleafapp.repo;

import com.a1dnan.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
