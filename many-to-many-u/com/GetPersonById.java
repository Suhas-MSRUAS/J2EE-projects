package com.js.mtmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Person person = em.find(Person.class, 1);
		if(person!=null) {
			System.out.println("person Name :"+person.getPersonName());
			System.out.println("person email :"+person.getEmail());
			System.out.println("person Number :"+person.getPhoneNumber());
			List<Cab> cabs = person.getCabs();
					if(!cabs.isEmpty()) {
						for(Cab c : cabs) {
							System.out.println("cab DriverName : "+c.getDriverName());
							System.out.println("cab price :"+ c.getPrice());
							System.out.println("=========================================");
						}
					}else {
						System.out.println("no cabs booked");
					}
		}else {
			System.out.println("no person present");
		}
	}

}
