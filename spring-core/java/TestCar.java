package com.js.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestCar {
	public static void main(String[] args) {

		ClassPathResource classPathResource = new ClassPathResource("test.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Car car = (Car) beanFactory.getBean("car");
		car.e.start();
	}
}
