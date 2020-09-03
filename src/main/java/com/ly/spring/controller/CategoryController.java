package com.ly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Category;
import com.ly.spring.service.CategoryService;
@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@PostMapping("getCategoryAll")
	public List<Category> getCategoryAll() {
		return categoryService.getCategoryAll();

	}
}
