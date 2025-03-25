package com.js.demo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		Employee e = new Employee();
		e.setId(10	);
		e.setName("suhas");
		e.setEmail("suhas@gmail.com");
		e.setPhone(9844052691l);
		e.setSalary(2000000);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
	}

}
