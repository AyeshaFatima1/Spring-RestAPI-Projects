package com.spring.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Product1 {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String product_Name;
	public float product_Price;
	public String launch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public float getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(float product_Price) {
		this.product_Price = product_Price;
	}
	public String getLaunch() {
		return launch;
	}
	public void setLaunch(String launch) {
		this.launch = launch;
	}
	public Product1(int id, String product_Name, float product_Price, String launch) {
		super();
		this.id = id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
		this.launch = launch;
	}
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_Name=" + product_Name + ", product_Price=" + product_Price + ", launch="
				+ launch +"]";
	}
}
