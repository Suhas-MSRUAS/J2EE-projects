package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class DeleteProductById {
	public static void main(String [] args) {
		ProductCRUD pc = new ProductCRUD();
		Product p = pc.getProductById(11);
		if(p!=null) {
			int a= pc.deleteProductById(11);
			if(a>0) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("failed");
			}
		}else {
			System.out.println("no product with given id");
		}
		
	}

}


