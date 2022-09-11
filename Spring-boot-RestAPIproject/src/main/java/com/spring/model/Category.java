package com.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer c_id;

	@Column(name = "category_name")
	private @NotBlank String categoryName;

	private @NotBlank String description;
	
	private @NotBlank String brand;

	@Column(name="image_URL")
	private  @NotBlank String imageURL;

	@OneToMany( fetch = FetchType.LAZY,mappedBy = "category",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	Set<Product> product;

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Category(Integer c_id, @NotBlank String categoryName, @NotBlank String description, @NotBlank String brand,
			@NotBlank String imageURL, Set<Product> product) {
		super();
		this.c_id = c_id;
		this.categoryName = categoryName;
		this.description = description;
		this.brand = brand;
		this.imageURL = imageURL;
		this.product = product;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}