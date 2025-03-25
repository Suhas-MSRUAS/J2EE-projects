package com.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Restaurant;
import com.springboot.repository.RestaurantRepository;

@Repository
public class RestaurantDao {
	@Autowired
	RestaurantRepository restaurantRepository;
	
	public Restaurant saveRestaurant(Restaurant r) {
		return restaurantRepository.save(r);
	}
	
	public List<Restaurant> getAllrestaurants(){
		return restaurantRepository.findAll();
	}
	
	public Restaurant getRestaurantById(int id) {
		Optional<Restaurant> optional = restaurantRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	
	public boolean deleteById(int id) {
		Restaurant r = getRestaurantById(id);
		if(r!=null) {
			restaurantRepository.delete(r);
			return true;
		}else {
			return false;
		}
	}
	
	public Restaurant updateById(int id) {
		Restaurant r = getRestaurantById(id);
		if(r!=null) {
			return restaurantRepository.save(r);
		}else {
			return null;
		}
	}
}
