package com.js.controller;

import java.util.List;

import com.js.dao.MobileCRUD;
import com.js.dto.Mobile;

public class GetAllMobiles {
	public static void main(String[] args) {
		List<Mobile> mobiles = MobileCRUD.getAllMobiles();
		if(mobiles.size()>0) {
			for(Mobile m : mobiles) {
				System.out.println(m);
				System.out.println("==================");
			}
		}else {
			System.out.println("no mobiles found");
		}
		
	}

}
