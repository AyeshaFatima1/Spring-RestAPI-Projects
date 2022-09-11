package com.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="p_id")
    private Integer p_id;

    @Column(name="p_Name")
    private @NotNull String name;
    
    private @NotNull String description;
    
    private @NotNull double price;
    
    @Column(name="image_URL")
    private @NotNull String imageURL;
   
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="category_id",referencedColumnName = "c_id")
    @JsonIgnoreProperties("product")
    public Category category;

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(Boolean value1, String value2) {
		
	}
	public Product(Integer p_id, @NotNull String name, @NotNull String description, @NotNull double price,
			@NotNull String imageURL, Category category) {
		super();
		this.p_id = p_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageURL = imageURL;
		this.category = category;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}