package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarJPADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			EntityManagerFactory factory= Persistence.createEntityManagerFactory("myPu");
			EntityManager manager= factory.createEntityManager();
			EntityTransaction tx= manager.getTransaction();
			
			
			Car c =new Car();
			c.setId(200);
			c.setName("swift");
			c.setCompany("maruti");
			c.setColor("White");
			c.setHorsePower(10000.00f);
			c.setPrice(100000.00f);
			c.setLaunchDate("26-Feb-17");
			
			
			tx.begin();
			manager.persist(c);
			tx.commit();
			System.out.println("Car Stored");
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
