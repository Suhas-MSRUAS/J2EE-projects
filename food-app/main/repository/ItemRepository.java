package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.dto.Item;

public interface ItemRepository extends JpaRepository<Item, String> {
	@Query("select i from item where i.name:=myitem")
	Item getItem(@Param("myitem")String name);

	
}
