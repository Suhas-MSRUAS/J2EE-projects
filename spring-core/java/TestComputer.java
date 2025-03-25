package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestComputer {

	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource(path);
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Computer c = (Computer) beanFactory.getBean("com");
		System.out.println(c.brand);
		System.out.println(c.id);
		System.out.println(c.processor);
		c.start();
				
	}
}
