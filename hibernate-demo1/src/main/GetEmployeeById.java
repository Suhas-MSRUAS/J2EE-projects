package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEmployeeById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		Employee e = em.find(Employee.class, 11);
		if(e!=null) {
			System.out.println(e);
		}else {
			System.out.println("no employee by the given id");
		}
	}

}
