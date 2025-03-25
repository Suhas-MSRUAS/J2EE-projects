package com.js.ac;

import org.springframework.stereotype.Component;

@Component
public class Chocolate implements Icecream{
	public void eat() {
		System.out.println("eating chocolate icecream");
	}

}
