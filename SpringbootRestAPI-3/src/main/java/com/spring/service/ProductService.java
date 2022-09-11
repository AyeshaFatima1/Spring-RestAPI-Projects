package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Product1;
import com.spring.repository.ProductRepo1;


@Service
public class ProductService {

@Autowired
private ProductRepo1 proRepo;

public List<Product1> getProducts() {
	return proRepo.findAll();
}

public Product1 addProduct(Product1 p) {
	return proRepo.save(p);
}

public Product1 getProduct(Integer id) {
	return proRepo.findById(id).orElseThrow(null);
}

public Product1 upProduct(Product1 p) {
	return proRepo.save(p);
}

public void del(Integer id) {
	proRepo.deleteById(id);;
}

}
