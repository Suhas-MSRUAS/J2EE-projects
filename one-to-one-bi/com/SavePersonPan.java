package otoubi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setName("goobe");
		person.setEmail("goobe@gmail.com");
		person.setPhone(9898989898l);
		
		
		Pan pan = new Pan();
		pan.setPanNumber("ABCD098765");
		pan.setDob("24-may-1997");
		
		person.setPan(pan);
		pan.setPerson(person);
		
		et.begin();
		em.persist(pan);
		em.persist(person);
		et.commit();
	}

}
