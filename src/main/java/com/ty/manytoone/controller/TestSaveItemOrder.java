package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.dao.*;

public class TestSaveItemOrder {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		AmazonOrder amazonOrder = new AmazonOrder();
		amazonOrder.setAddress("BTM Layout");
		amazonOrder.setName("Office Items");
		amazonOrder.setStatus("Getting prepared");
		
		Item item1 = new Item();
		item1.setName("Working table");
		item1.setPrice(12000);
		item1.setQuantity(1);
		item1.setOrder_id(amazonOrder);
		
		Item item2 = new Item();
		item2.setName("Working chair");
		item2.setPrice(5000);
		item2.setQuantity(1);
		item2.setOrder_id(amazonOrder);
		
		Item item3 = new Item();
		item3.setName("HP Laptop");
		item3.setPrice(64000);
		item3.setQuantity(1);
		item3.setOrder_id(amazonOrder);
		
		entityTransaction.begin();
		entityManager.persist(amazonOrder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityTransaction.commit();
	
	}
}
