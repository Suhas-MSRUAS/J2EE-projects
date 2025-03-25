package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.dao.RestaurantDao;
import com.springboot.dto.ResponseStructure;
import com.springboot.dto.Restaurant;

@Service
public class RestaurantService {

	@Autowired
	RestaurantDao restaurantDao;
	
	public ResponseStructure<Restaurant> saveRestaurant(Restaurant r){
		ResponseStructure<Restaurant> rResponseStructure = new ResponseStructure<Restaurant>();
		Restaurant restaurant = restaurantDao.saveRestaurant(r);
		if(restaurant!=null) {
			rResponseStructure.setStatusCode(HttpStatus.CREATED.value());
			rResponseStructure.setMessage("Data saved successfully");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}else {
			rResponseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
			rResponseStructure.setMessage("failed to save data");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}
	}
	
	public ResponseStructure<List<Restaurant>> getAllrestaurants(){
		ResponseStructure<List<Restaurant>> rResponseStructure = new ResponseStructure<List<Restaurant>>();
		List<Restaurant> restaurants = restaurantDao.getAllrestaurants();
		if(restaurants.size()>0) {
			rResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			rResponseStructure.setMessage("All restaurants");
			rResponseStructure.setData(restaurants);
			return rResponseStructure;
		}else {
			rResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			rResponseStructure.setMessage("No restaurants found");
			rResponseStructure.setData(restaurants);
			return rResponseStructure;
		}
	}
	
	public ResponseStructure<Restaurant> getRestaurantById(int id){
		ResponseStructure<Restaurant> rResponseStructure = new ResponseStructure<Restaurant>();
		Restaurant restaurant = restaurantDao.getRestaurantById(id);
		if(restaurant!=null) {
			rResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			rResponseStructure.setMessage("Found the restaurant");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}else {
			rResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			rResponseStructure.setMessage("Did not find any restaurant");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}
	}
	
	public ResponseStructure<String> deleteRestaurantById(int id){
		ResponseStructure<String> rResponseStructure = new ResponseStructure<String>();
		boolean r = restaurantDao.deleteById(id);
		if(r) {
			rResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			rResponseStructure.setMessage("Restaurant deleted");
			rResponseStructure.setData("deleted");
			return rResponseStructure;
		}else {
			rResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			rResponseStructure.setMessage("failed");
			rResponseStructure.setData("not found");
			return rResponseStructure;
		}
	}
	
	public ResponseStructure<Restaurant> updateRestaurantById(int id, Restaurant r){
		ResponseStructure<Restaurant> rResponseStructure = new ResponseStructure<Restaurant>();
		Restaurant restaurant = restaurantDao.updateById(id);
		if(restaurant!=null) {
			rResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			rResponseStructure.setMessage("successfully updated");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}else {
			rResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			rResponseStructure.setMessage("failed to update");
			rResponseStructure.setData(restaurant);
			return rResponseStructure;
		}
	}
}
