package com.spring.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Counter;
import com.spring.model.Product;
import com.spring.model.ProductRequest;
import com.spring.repository.CounterRepo;
import com.spring.repository.ProductRepo;

@Service
public class ProductService {

@Autowired
public ProductRepo proRepo;

@Autowired
public CounterRepo counRepo;

public List<Product> getProducts() {
	return proRepo.findAll();
}

public Product addProduct(ProductRequest productRequest) {
	Product p=new Product();
	p.setId(productRequest.id);
	p.setProduct_Name(productRequest.product_Name);
	p.setProduct_Price(productRequest.product_Price);
	p.setLaunch(productRequest.launch);
	p.setCounter(productRequest.counter
			.stream().map(counters->{
			Counter c=new Counter();
			if(c.getId()>0) {
				c=counRepo.findById(c.getId());
			}
			c.addProduct(p);
			return c;
			})
			.collect(Collectors.toSet()));
	return proRepo.save(p);
}

public Product getProduct(Integer id) {
	return proRepo.findById(id).orElseThrow(null);
}

public Product updateProduct(Product p) {
	return proRepo.save(p);
}

public void deleteProduct(Integer id) {
	proRepo.deleteById(id);;
}

public List<Counter> getCounters() {
	return counRepo.findAll();
}

public Counter addCounter(Counter c) {
	return counRepo.save(c);
}

public Counter getCounter(Integer id) {
	return counRepo.findById(id).orElseThrow(null);
}

public Counter updateCounter(Counter c) {
	return counRepo.save(c);
}

public void deleteCounter(Integer id) {
	counRepo.deleteById(id);;
}
}
