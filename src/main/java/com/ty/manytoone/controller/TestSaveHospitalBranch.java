package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.dao.Branch;
import com.ty.manytoone.dao.Hosptial;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hosptial hosptial = new Hosptial();
		hosptial.setName("Vasan Eye Care");
		hosptial.setWeb("vasan.com");
		
		Branch branch1 = new Branch();
		branch1.setCountry("India");
		branch1.setName("BTM Layout");
		branch1.setPhone(693157840l);
		branch1.setState("Karnataka");
		branch1.setHosptial(hosptial);
		
		Branch branch2 = new Branch();
		branch2.setCountry("India");
		branch2.setName("Indiranagar");
		branch2.setPhone(7539164802l);
		branch2.setState("Karnataka");
		branch2.setHosptial(hosptial);
		
		Branch branch3 = new Branch();
		branch3.setCountry("India");
		branch3.setName("Electronic City");
		branch3.setPhone(8520369741l);
		branch3.setState("Karnataka");
		branch3.setHosptial(hosptial);
		
		entityTransaction.begin();
		entityManager.persist(hosptial);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	}
}
