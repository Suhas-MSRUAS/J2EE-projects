package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("select c from customer where c.email=:myemail and c.phone=:myphone")
	Customer loginCustomer(@Param("myemail")String email, @Param("myphone")long phone);

}
