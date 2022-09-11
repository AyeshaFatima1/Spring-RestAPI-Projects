package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Counter {

	@Id
	public int id;
	public long cashier_Id;
	public String payment_Method;
	
	@ManyToMany(mappedBy = "counter")
	public Set<Product> product=new HashSet<Product>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCashier_Id() {
		return cashier_Id;
	}

	public void setCashier_Id(long cashier_Id) {
		this.cashier_Id = cashier_Id;
	}

	public String getPayment_Method() {
		return payment_Method;
	}

	public void setPayment_Method(String payment_Method) {
		this.payment_Method = payment_Method;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public void addProduct(Product p) {
		this.product.add(p);
	}
	public Counter(int id, long cashier_Id, String payment_Method, Set<Product> product) {
		super();
		this.id = id;
		this.cashier_Id = cashier_Id;
		this.payment_Method = payment_Method;
		this.product = product;
	}

	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Counter [id=" + id + ", cashier_Id=" + cashier_Id + ", payment_Method=" + payment_Method + ", product="
				+ product + "]";
	}
	
	}
