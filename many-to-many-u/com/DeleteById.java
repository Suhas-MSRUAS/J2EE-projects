package com.js.mtmu;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 1);
		
		if(p!=null) {
			
			
			et.begin();
			em.remove(p);
			et.commit();
		}else {
			System.out.println("no id present");
		}
	}
 
	
}
