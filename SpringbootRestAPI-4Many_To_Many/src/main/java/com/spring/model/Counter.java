package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Counter {

	@Id
	public int counter_id;
	public long cashier_No;
	public String payment_Method;
	
	@ManyToMany(mappedBy = "counter")
	public Set<Product> product=new HashSet<Product>();

	public int getCounter_id() {
		return counter_id;
	}

	public void setCounter_id(int counter_id) {
		this.counter_id = counter_id;
	}

	public long getCashier_Id() {
		return cashier_No;
	}

	public void setCashier_Id(long cashier_Id) {
		this.cashier_No = cashier_No;
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

	public Counter(int counter_id, long cashier_Id, String payment_Method, Set<Product> product) {
		super();
		this.counter_id = counter_id;
		this.cashier_No = cashier_No;
		this.payment_Method = payment_Method;
		this.product = product;
	}

	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Counter [counter_id=" + counter_id + ", cashier_No=" + cashier_No + ", payment_Method=" + payment_Method
				+ ", product=" + product + "]";
	}
	}
