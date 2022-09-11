package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Category;
import com.spring.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	public CategoryRepository categoryRepository;
	
	public List<Category> getCategorys() {
		return categoryRepository.findAll();
	}

	public Category addCategory(Category c) {
		return categoryRepository.save(c);
	}

	public Category getCategory(Integer c_id) {
		return categoryRepository.findById(c_id).orElseThrow(null);
	}

	public Category updateCategory(Category c) {
		return categoryRepository.save(c);
	}

	public void deleteCategory(Integer c_id) {
		categoryRepository.deleteById(c_id);;
	}

}
