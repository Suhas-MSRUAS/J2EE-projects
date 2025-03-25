package com.js.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class GetById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Branch b = em.find(Branch.class, 1);
		if(b!=null) {
			System.out.println("BranchName : "+b.getBranchName());
			System.out.println("BranchAddress :"+b.getAddress());
			System.out.println("Branchpincode :"+ b.getPincode());
			Company c = b.getC();
			if(c!=null) {
				System.out.println("CompanyNmae :"+c.getCompanyName());
				System.out.println("Company GST : "+ c.getGST());
			}else {
				System.out.println("No company found");
			}
		}else {
			System.out.println("No branch with given id");
		}
	}

}
