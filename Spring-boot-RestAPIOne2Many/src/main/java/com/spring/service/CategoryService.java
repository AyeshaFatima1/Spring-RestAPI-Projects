package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Category;
import com.spring.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	public CategoryRepository counRepo;
	
	public List<Category> getCategorys() {
		return counRepo.findAll();
	}

	public Category addCategory(Category c) {
		return counRepo.save(c);
	}

	public Category getCategory(String categoryName) {
		return counRepo.findByCategoryName(categoryName);
	}

	public Category getCategoryById(Integer id) {
		return counRepo.findCategoryById(id);
	}
	public Category updateCategory(Category c) {
		return counRepo.save(c);
	}

	public void deleteCategory(Integer id) {
		counRepo.deleteById(id);;
	}

}
