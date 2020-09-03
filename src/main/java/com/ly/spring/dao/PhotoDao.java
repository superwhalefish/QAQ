package com.ly.spring.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.ly.spring.entity.Photo;
public interface PhotoDao extends JpaRepository<Photo, Integer>, JpaSpecificationExecutor<Photo> {
	@Query(value="select id,p_author,p_code,p_content,p_title,p_uptime,p_url FROM Photo  where p_code=?1",nativeQuery = true)
	List<Photo> findByP_code(String p_code);

}
