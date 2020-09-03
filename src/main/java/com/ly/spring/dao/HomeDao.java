package com.ly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ly.spring.entity.Home;

public interface HomeDao extends JpaRepository<Home, Integer>,JpaSpecificationExecutor<Home>{

}
