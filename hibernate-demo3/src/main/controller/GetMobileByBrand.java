package com.js.controller;

import java.util.List;

import com.js.dao.MobileCRUD;
import com.js.dto.Mobile;

public class GetMobileByBrand {
	public static void main(String[] args) {
		List<Mobile> mobiles = MobileCRUD.getMobileByBrand("samsung");
		if(mobiles.size()>0) {
			for(Mobile m : mobiles) {
				System.out.println(m);
				System.out.println("================");
			}
		}else {
			System.out.println("no mobiles foundd");
		}
	}

}
