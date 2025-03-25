package otmbi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			
		Mobile m = new Mobile();
		m.setMobileName("samsung");
		m.setBrand("s20");
		m.setPrice(50000);
		
		
		List<Sim> sims = new ArrayList<Sim>();
		Sim s1 = new Sim();
		s1.setProvider("airtel");
		s1.setType("5g");
		
		Sim s2 = new Sim();
		s2.setProvider("idea");
		s2.setType("5g");
		
		sims.add(s1);
		sims.add(s2);
		
		m.setSims(sims);
		s1.setMobile(m);
		s2.setMobile(m);
		
		
		et.begin();
		em.persist(m);
		et.commit();
		
		
		
		
	}

}
