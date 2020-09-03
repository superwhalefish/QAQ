package com.ly.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ly.spring.dao.PhotoDao;
import com.ly.spring.entity.Photo;

public interface PhotoService {

	List<Photo> getPhotoAll();

	List<Photo> getPhotoByP_code(String p_code);
}
