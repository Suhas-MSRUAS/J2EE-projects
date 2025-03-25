package com.js.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployeeById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee e = em.find(Employee.class, 8);
		if(e!=null) {
			e.setEmail("boi@gamil.com");
			e.setName("master");
			e.setPhone(9844052691l);
			e.setSalary(6300000);
			
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println("updated");
		}else {
			System.out.println("no employee");
		}
	}

}
