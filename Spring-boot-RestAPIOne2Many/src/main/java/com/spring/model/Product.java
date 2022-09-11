package com.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull double price;
    private @NotNull String description;
   // private @NotNull int cid; 

    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumn(name="category_id",referencedColumnName = "id")

    public Category category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	/*public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}*/

	public Product(Integer id, @NotNull String name, @NotNull String imageURL, @NotNull double price,
			@NotNull String description, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	}