package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Category;
import com.spring.service.CategoryService;

@RestController
public class CategoryController {

@Autowired
public CategoryService categoryService;

@GetMapping("/Categorylist")
public List<Category> getCategorys(){
	return categoryService.getCategorys();
}

@PostMapping("/addCategory")
@ResponseBody
public Category addCategory(@RequestBody Category c) {
	 Category categoryResponse=categoryService.addCategory(c);
	 return categoryResponse;
}

@GetMapping("/Category/{categoryName}")
public Category getCategory(@PathVariable String categoryName) {
	return categoryService.getCategory(categoryName);
}

@PutMapping("/updateCategory/{id}")
public Category updateCategory(@RequestBody Category c) {
	return categoryService.updateCategory(c);
}

@DeleteMapping("/deleteCategory/{id}")
public void deleteCategory(@PathVariable Integer id) {
	categoryService.deleteCategory(id);
}
}
