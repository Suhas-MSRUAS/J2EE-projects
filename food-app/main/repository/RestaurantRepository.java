package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.dto.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{
	@Query("select r from restaurant where r.name:=myrestaurant and r.phone:=myphone")
	Restaurant getRestaurant(@Param("myrestaurant") String name, @Param("myphone")long phone);

}
