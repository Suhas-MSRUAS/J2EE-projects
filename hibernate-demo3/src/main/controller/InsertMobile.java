package com.js.controller;

import com.js.dao.MobileCRUD;
import com.js.dto.Mobile;

public class InsertMobile {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setName("freedom250");
		m.setBrand("freedom");
		m.setRam("8GB");
		m.setPrice(560);
		
		if(MobileCRUD.saveMobile(m)) {
			System.out.println("inserted");
		}else {
			System.out.println("failed");
		}
	}

}
