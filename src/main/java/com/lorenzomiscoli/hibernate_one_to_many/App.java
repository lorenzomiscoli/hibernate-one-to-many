package com.lorenzomiscoli.hibernate_one_to_many;

import com.lorenzomiscoli.hibernate_one_to_many.entities.Customer;
import com.lorenzomiscoli.hibernate_one_to_many.entities.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("default");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		Customer customer = new Customer();
		customer.addOrder(new Order());
		em.persist(customer);
		em.getTransaction().commit();
		em.close();
		emFactory.close();
	}
	
}
