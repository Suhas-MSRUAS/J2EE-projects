package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class UpdateProductById {
	public static void main(String[] args) {
		Product p = new Product();
		p.setBrand("wrogn");
		p.setName("suhas");
		p.setQuantity(20);
		p.setPrice(25000);
		
		ProductCRUD pc = new ProductCRUD();
		Product p1 = pc.getProductById(1);
		if(p!=null) {
			int a= pc.updateProductById(1,p);
			if(a>0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("failed");
			}
		}else {
			System.out.println("no product with given id");
		}
	}
}

		
		
	


