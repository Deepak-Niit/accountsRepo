package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * findBy means select query , MobileNumber means column name.
     * @param mobileNumber
     * @return
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
