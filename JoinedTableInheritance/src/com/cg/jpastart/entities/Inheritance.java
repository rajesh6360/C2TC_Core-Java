package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("Rajesh");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Shashank");
		manager.setSalary(8000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database demo2.");
		//em.close();
		//factory.close();

	}

}