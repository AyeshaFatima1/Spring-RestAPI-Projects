package com.spring.contoller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Product1;
import com.spring.service.ProductService;

@RestController
public class ProductContoller {

@Autowired
private ProductService proService;

@GetMapping("/home")
public String homePage() {
	return "Welcome to Home Page";
}

@GetMapping("/productlist")
public List<Product1> getProducts(){
	return this.proService.getProducts();
}

@PostMapping("/addproduct")
public Product1 addProduct(@RequestBody Product1 p) {
	return this.proService.addProduct(p);
}

@GetMapping("/product/{id}")
public Product1 getProduct(@PathVariable Integer id) {
	return this.proService.getProduct(id);
}

/*@PutMapping("/updateproduct")
public Product1 upProduct(@RequestBody Product1 p) {
	return this.proService.upProduct(p);
}*/

/*@PutMapping("/update/{id}")
public Product1 upProduct(@RequestBody Product1 p, @PathVariable Integer id) {
	try {
		Product1 exiProduct1=proService.getProduct(id);
		p.setId(id);
	    proService.upProduct(p);
	    return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}*/

@DeleteMapping("/delete/{id}")
public void del(@PathVariable Integer id) {
	proService.del(id);
}

}
