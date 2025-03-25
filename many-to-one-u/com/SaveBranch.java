package com.js.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBranch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Branch b = new Branch();
		b.setBranchName("hinkal");
		b.setAddress("hinkal Mysore");
		b.setPincode(570022);
		
		
		Company c = em.find(Company.class, 1);
		if(c!=null) {
			b.setC(c);
		}
		
		et.begin();
		em.persist(b);
		et.commit();
		
	}

}
