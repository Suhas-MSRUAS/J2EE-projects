package otmbi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Mobile m = em.find(Mobile.class, 1);
		if(m!=null) {
			System.out.println("mobile name : "+m.getMobileName());
			System.out.println("mobile brand : "+m.getBrand());
			System.out.println("mobile price : "+m.getPrice());
			
			
			List<Sim>sims = m.getSims();
			if(sims.size()>0) {
				for(Sim s : sims) {
					System.out.println("sim provider :"+s.getProvider());
					System.out.println("sim type :"+s.getType());
					System.out.println("===================================================================================");
				}
			}else {
				System.out.println("no sim");
			}
		}else {
			System.out.println("no mobile id present");
		}
			
	}

}
