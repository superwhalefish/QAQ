package com.ly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ly.spring.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>,JpaSpecificationExecutor<Category>{

}
