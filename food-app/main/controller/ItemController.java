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

import com.springboot.dto.Item;
import com.springboot.dto.ResponseStructure;
import com.springboot.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@PostMapping("/items")
	public ResponseStructure<Item> saveItem(@RequestBody Item i){
		return itemService.saveItem(i);
	}
	
	@GetMapping("/items")
	public ResponseStructure<List<Item>> getAllItem(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{name}")
	public ResponseStructure<Item> getItemByName(@PathVariable String name){
		return itemService.getItemsByName(name);
	}
	@DeleteMapping("/items")
	public ResponseStructure<String>  deleteItemByName(@RequestParam String name){
		return itemService.deleteItemByName(name);
	}
	
	@PutMapping("/items")
	public ResponseStructure<Item> uptadeItemByName(@PathVariable String name, @RequestBody Item item){
		return itemService.updateItemByName(name);
	}
	
}
