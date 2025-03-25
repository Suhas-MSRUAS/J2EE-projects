package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestDog {

	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Dog d = (Dog) beanFactory.getBean("dog");
		d.bark();
	}
}
