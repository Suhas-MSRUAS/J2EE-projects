package com.js.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllEmployees {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		String query = "select e from Employee e";
		Query q = em.createQuery(query);
		List<Employee> employees = q.getResultList();
		if(employees.size()>0) {
			for(Employee e: employees) {
				System.out.println(e);
				System.out.println("==================");
			}
		}else {
			System.out.println("no employees in table");
		}
	}

}
