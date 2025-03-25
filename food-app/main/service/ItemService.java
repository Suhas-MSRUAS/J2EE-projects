package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.dao.ItemDao;
import com.springboot.dto.Item;
import com.springboot.dto.ResponseStructure;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	
	public ResponseStructure<Item> saveItem(Item i){
		ResponseStructure<Item> iResponseStructure = new ResponseStructure<Item>();
		Item item = itemDao.saveitem(i);
		if(item!=null) {
			iResponseStructure.setStatusCode(HttpStatus.CREATED.value());
			iResponseStructure.setMessage("Item saved successfully");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}else {
			iResponseStructure.setStatusCode(HttpStatus.NO_CONTENT.value());
			iResponseStructure.setMessage("failed to save item");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}
	}
	
	public ResponseStructure<List<Item>> getAllItems(){
		ResponseStructure<List<Item>> iResponseStructure = new ResponseStructure<List<Item>>();
		List<Item> items = itemDao.getAllItem();
		if(items.size()>0) {
			iResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			iResponseStructure.setMessage("found all items");
			iResponseStructure.setData(items);
			return iResponseStructure;
		}else {
			iResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			iResponseStructure.setMessage("items not found");
			iResponseStructure.setData(items);
			return iResponseStructure;
		}
	}
	
	public ResponseStructure<Item> getItemsByName(String name){
		ResponseStructure<Item> iResponseStructure = new ResponseStructure<Item>();
		Item item = itemDao.getItemByName(name);
		if(item!=null) {
			iResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			iResponseStructure.setMessage("found item");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}else {
			iResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			iResponseStructure.setMessage("item not found");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}
	}
	
	public ResponseStructure<String> deleteItemByName(String name){
		ResponseStructure<String> iResponseStructure = new ResponseStructure<String>();
		boolean i = itemDao.deleteItemByName(name);
		if(i) {
			iResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			iResponseStructure.setMessage("item deleted");
			iResponseStructure.setData("deleted");
			return iResponseStructure;
		}else {
			iResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			iResponseStructure.setMessage("failed to delete");
			iResponseStructure.setData("not found");
			return iResponseStructure;
		}
	}
	
	public ResponseStructure<Item> updateItemByName(String name){
		ResponseStructure<Item> iResponseStructure = new ResponseStructure<Item>();
		Item item = itemDao.updateitemByName(name);
		if(item!=null) {
			iResponseStructure.setStatusCode(HttpStatus.FOUND.value());
			iResponseStructure.setMessage("item updated successfully");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}else {
			iResponseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			iResponseStructure.setMessage("failed to update");
			iResponseStructure.setData(item);
			return iResponseStructure;
		}
	}
}
