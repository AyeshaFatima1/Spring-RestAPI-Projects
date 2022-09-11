package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Category;
import com.spring.model.Product;
import com.spring.service.CategoryService;
import com.spring.service.ProductService;

@RestController
public class ProductContoller {

@Autowired
public ProductService proService;

@Autowired
public CategoryService categoryService;

@GetMapping("/home")
public String homePage() {
	return "Welcome to Home Page";
}

@GetMapping("/productlist")
public List<Product> getProducts(){
	return this.proService.getProducts();
}
@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product p) {
		return proService.addProduct(p);

}
/*@PostMapping("/addproduct1")
public Product addProduct1(@RequestBody Product p) {
	Category c=this.categoryService.getCategoryById(p.getCid());
	System.out.println("====>"+c.getCategoryName());
	System.out.println("Id==>"+p.getCid());
	p.setCategory(c);
	return this.proService.addProduct1(p);
}*/

@GetMapping("/product/{id}")
public Product getProduct(@PathVariable Integer id) {
	return this.proService.getProduct(id);
}

@PutMapping("/updateproduct/{id}")
public Product updateProduct(@RequestBody Product p) {
	return this.proService.updateProduct(p);
}

@DeleteMapping("/deleteproduct/{id}")
public void deleteProduct(@PathVariable Integer id) {
	proService.deleteProduct(id);
}

}
