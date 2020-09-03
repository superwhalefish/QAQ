package com.ly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ly.spring.entity.Synopsis;

public interface SynopsisDao extends JpaRepository<Synopsis, Integer>,JpaSpecificationExecutor<Synopsis>{

}
