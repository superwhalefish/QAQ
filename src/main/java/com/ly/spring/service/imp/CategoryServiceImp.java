package com.ly.spring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.dao.CategoryDao;
import com.ly.spring.entity.Category;
import com.ly.spring.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategoryAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

}
