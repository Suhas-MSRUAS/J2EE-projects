package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		Pan pan = new Pan();
		pan.setDob("24-may-1997");
		pan.setPanNumber("SUHA213421");
		
		
		Person p = new Person();
		p.setName("Goku");
		p.setEmail("goku@gmail.com");
		p.setPhone(9844052691l);
		p.setPan(pan);
		
		
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
		
		
		
	}

}
