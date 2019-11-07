package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchCar {
	
public static void main(String args[]){
	try{
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("myPu");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction tx= manager.getTransaction();
		Car c= manager.find(Car.class, 100);
		tx.begin();
		c.setPrice(20000.00f);
		c.setLaunchDate("12-Jun-19");
		tx.commit();
		System.out.println(""+c);
		
		c= null;
		c=manager.find(Car.class, new Integer(100));
		System.out.println(""+c);
		
		
		Car c1= manager.find(Car.class,new Integer(200));
		System.out.println("Before Update"+c1);
		tx.begin();
		manager.remove(c1);
		tx.commit();
		
		 
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
