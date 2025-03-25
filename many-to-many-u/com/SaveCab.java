package com.js.mtmu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCab {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Cab c1 = new Cab();
		c1.setDriverName("bakasura");
		c1.setPrice(200);
		
		Cab c2 = new Cab();
		c2.setDriverName("markandeya");
		c2.setPrice(150);
		
		Cab c3 = new Cab();
		c3.setDriverName("rishi");
		c3.setPrice(210);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();
	}

}
