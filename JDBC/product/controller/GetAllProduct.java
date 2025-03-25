package com.js.controller;

import java.util.ArrayList;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class GetAllProduct {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		ProductCRUD pc = new ProductCRUD();
		ArrayList <Product> p2 = pc.getallProductBy();
		if(p2.size()>0) {
			for(Product p:p2)
			System.out.println(p2);
		}else {
			System.out.println("no product in table");
		}
		
	}

}
