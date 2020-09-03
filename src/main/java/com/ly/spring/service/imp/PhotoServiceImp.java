package com.ly.spring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.dao.PhotoDao;
import com.ly.spring.entity.Photo;
import com.ly.spring.service.PhotoService;

@Service
public class PhotoServiceImp implements PhotoService {
	@Autowired
	private PhotoDao photoDao;

	@Override
	public List<Photo> getPhotoAll() {
		// TODO Auto-generated method stub
		
		return photoDao.findAll();
	}

	@Override
	public List<Photo> getPhotoByP_code(String p_code) {
		// TODO Auto-generated method stub
		return photoDao.findByP_code(p_code);
	}

}
