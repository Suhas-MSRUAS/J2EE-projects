package com.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Item;
import com.springboot.repository.ItemRepository;

@Repository
public class ItemDao {

	@Autowired
	ItemRepository itemRepository;
	
	public Item saveitem(Item i) {
		return itemRepository.save(i);
	}
	
	public List<Item> getAllItem(){
		return itemRepository.findAll();
	}
	
	public Item getItemByName(String name) {
		Optional<Item> optional = itemRepository.findById(name);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	
	public boolean deleteItemByName(String name) {
		Item i = getItemByName(name);
		if(i!=null) {
			itemRepository.delete(i);
			return true;
		}else {
			return false;
		}
	}
	
	public Item updateitemByName(String name) {
		Item i = getItemByName(name);
		if(i!=null) {
			return itemRepository.save(i);
		}else {
			return null;
		}
	}
}
