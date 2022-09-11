package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_date")
    private Date createdDate;

    private int quantity;
    
    @Column(name = "total_price")
    private Double totalPrice;

    @JsonIgnore
    @OneToOne()
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    public Cart() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart(Integer id, Date createdDate, int quantity, Double totalPrice, Product product,User user) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.user = user;
	}
}
