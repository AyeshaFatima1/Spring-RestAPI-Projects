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

import com.spring.model.Category;
import com.spring.model.Product;
import com.spring.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

@Autowired
public CategoryService categoryService;

@GetMapping("/")
public List<Category> getCategorys(){
	return this.categoryService.getCategorys();
}

@PostMapping("/addCategory")
public Category addCategory(@RequestBody Category c) {
	return this.categoryService.addCategory(c);
}

@GetMapping("/category/{c_id}")
public Category getCategory(@PathVariable Integer c_id) {
	return categoryService.getCategory(c_id);
}

@PutMapping("/updateCategory")
public Category updateCategory(@RequestBody Category c) {
	return this.categoryService.updateCategory(c);
}

@DeleteMapping("/deleteCategory/{id}")
public void deleteCategory(@PathVariable Integer c_id) {
	categoryService.deleteCategory(c_id);
}
}
