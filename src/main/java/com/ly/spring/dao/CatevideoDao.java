package com.ly.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.ly.spring.entity.Catevideo;

public interface CatevideoDao extends JpaRepository<Catevideo, Integer>, JpaSpecificationExecutor<Catevideo> {

}
