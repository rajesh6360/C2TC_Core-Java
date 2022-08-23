package com.cg.jpastart.entities;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Rakesh");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("Tumkur road");
		homeAddress.setCity("Bangalore");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("560 090");
		
		//Injection of address to student
		student.setAdress(homeAddress);
		System.out.println("Student data added");
		
		//persist
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		

	}

}