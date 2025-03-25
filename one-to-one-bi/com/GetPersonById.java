package otoubi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Person person = em.find(Person.class, 1);
		if(person!= null) {
			System.out.println("Person name : "+person.getName());
			System.out.println("person email : "+person.getEmail());
			System.out.println("person phone :"+person.getPhone());
			System.out.println("===================================");
			
			
			Pan pan = em.find(Pan.class, 1);
			if(pan!=null) {
				System.out.println("DOB :"+pan.getDob());
				System.out.println("Pan number :"+pan.getPanNumber());
			}else {
				System.out.println("Pan not availiable");
			}
		}
			
	}

}
