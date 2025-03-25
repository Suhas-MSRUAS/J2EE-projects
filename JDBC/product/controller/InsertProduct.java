package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class InsertProduct {
	public static void main(String[] args) {
		Product p = new Product();
		p.setId(6);
		p.setName("jacket");
		p.setBrand("bvlgiri");
		p.setQuantity(30);
		p.setPrice(35);
		
		ProductCRUD pc = new ProductCRUD();
		int a = pc.insert(p);
		if(a>0) {
			System.out.println("Inserted successfully");
		}else {
			System.err.println("failed");
		}
		
	}

}
