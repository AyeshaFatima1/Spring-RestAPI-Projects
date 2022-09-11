package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Product;
import com.spring.repository.ProductRepository;

@Service
public class ProductService {

@Autowired
public ProductRepository proRepo;

public List<Product> getProducts() {
	return proRepo.findAll();
}

public Product addProduct(Product p) {
	return proRepo.save(p);
}
/*public Product addProduct1(Product p) {
	return proRepo.save(p);
}*/
public Product getProduct(Integer id) {
	return proRepo.findById(id).orElseThrow(null);
}

public Product updateProduct(Product p) {
	return proRepo.save(p);
}

public void deleteProduct(Integer id) {
	proRepo.deleteById(id);;
}

}
