package com.example.BankingApplication.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApplication.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
