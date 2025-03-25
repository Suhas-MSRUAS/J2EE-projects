package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.ResponseStructure;
import com.springboot.dto.Restaurant;
import com.springboot.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("/restaurants")
	public ResponseStructure<Restaurant> saveRestaurant(@RequestBody Restaurant r){
		return restaurantService.saveRestaurant(r);
	}
	@GetMapping("/restaurants")
	public ResponseStructure<List<Restaurant>> getAllrestaurant(){
		return restaurantService.getAllrestaurants();
	}
	@GetMapping("/restaurants")
	public ResponseStructure<Restaurant> getRestaurantbyId(@PathVariable int id){
		return restaurantService.getRestaurantById(id);
	}
	@DeleteMapping("/restaurants")
	public ResponseStructure<String> deleteRestaurantById(@RequestParam int id){
		return restaurantService.deleteRestaurantById(id);
	}
	@PutMapping("/restaurants")
	public ResponseStructure<Restaurant> updaterestaurantById(@PathVariable int id, @RequestBody Restaurant restaurant){
		return restaurantService.updateRestaurantById(id, restaurant);
	}
}
