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
	private Integer id;

	@Column(name = "category_name")
	private @NotBlank String categoryName;

	private @NotBlank String description;

	private @NotBlank String imageURL;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "category",cascade = CascadeType.ALL)
	
	Set<Product> product;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Category(Integer id, @NotBlank String categoryName, @NotBlank String description, @NotBlank String imageURL,
			Set<Product> product) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.description = description;
		this.imageURL = imageURL;
		this.product = product;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}