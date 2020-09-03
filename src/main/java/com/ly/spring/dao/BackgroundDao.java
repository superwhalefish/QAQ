package com.ly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ly.spring.entity.Background;

public interface BackgroundDao extends JpaRepository<Background, Integer>,JpaSpecificationExecutor<Background>{

}
