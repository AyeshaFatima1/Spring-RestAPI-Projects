package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Product;
import com.spring.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductContoller {

@Autowired
public ProductService proService;

@GetMapping("/")
public List<Product> getProducts(){
	return this.proService.getProducts();
}

@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product p) {
	return this.proService.addProduct(p);
}

@PostMapping("/addProduct1")
public ResponseEntity<Product> addProduct1(@RequestBody Product p) {
    proService.addProduct1(p);
return new ResponseEntity<Product>(new Product(true,"Product has been added"), HttpStatus.CREATED);
}

@GetMapping("/product/{id}")
public Product getProduct(@PathVariable Integer p_id) {
	return this.proService.getProduct(p_id);
}

@PutMapping("/updateProduct")
public Product updateProduct(@RequestBody Product p) {
	return this.proService.updateProduct(p);
}

@DeleteMapping("/deleteProduct/{id}")
public void deleteProduct(@PathVariable Integer p_id) {
	proService.deleteProduct(p_id);
}

}
