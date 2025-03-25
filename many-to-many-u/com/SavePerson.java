package com.js.mtmu;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setPersonName("vishwakarma");
		p.setEmail("vishwa@gmail.com");
		p.setPhoneNumber(9844232128l);
		
		
		Cab c1 = em.find(Cab.class, 1);
		Cab c2 = em.find(Cab.class, 2);
		Cab c3 = em.find(Cab.class, 3);
		
		List<Cab> cabs = new ArrayList<Cab>();
		cabs.add(c1);
		cabs.add(c2);
		cabs.add(c3);
		
		p.setCabs(cabs);
		
		
		et.begin();
		em.persist(p);
		et.commit();
	}

}
