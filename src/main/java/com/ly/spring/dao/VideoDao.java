package com.ly.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.ly.spring.entity.Video;

public interface VideoDao extends JpaRepository<Video, Integer>, JpaSpecificationExecutor<Video> {
	@Query(value = "SELECT id,v_author,v_code,v_content,v_time,v_title,v_url FROM Video where v_code=?1 ", nativeQuery = true)
	List<Video> findVideoByV_code(String v_code);

}
