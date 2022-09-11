package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Product1;

public interface ProductRepo1 extends JpaRepository<Product1, Integer>{

	// List<Product> findByproduct_Name(String product_Name);
}