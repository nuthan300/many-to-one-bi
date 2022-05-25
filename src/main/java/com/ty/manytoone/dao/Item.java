package com.ty.manytoone.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price, quantity;
	@ManyToOne
	private AmazonOrder order_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AmazonOrder getOrder_id() {
		return order_id;
	}

	public void setOrder_id(AmazonOrder order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println();
		System.out.println("Order Details: ");
		System.out.println(order_id);
		System.out.println();

		return "";
	}
}
