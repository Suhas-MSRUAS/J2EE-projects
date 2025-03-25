package com.js.controller;

import com.js.dao.MobileCRUD;
import com.js.dto.Mobile;

public class UpdateMobielById {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setName("SE24");
		m.setBrand("okinawa");
		m.setRam("8GB");
		m.setPrice(45000);
		
		boolean b = MobileCRUD.updateMobileById(1, m);
		if(b) {
			System.out.println("updated");
			
		}else {
			System.out.println("failed");
		}
	}
}
