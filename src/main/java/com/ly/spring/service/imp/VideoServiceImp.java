package com.ly.spring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.dao.VideoDao;
import com.ly.spring.entity.Video;
import com.ly.spring.service.VideoService;

@Service
public class VideoServiceImp implements VideoService {
	@Autowired
	private VideoDao videoDao;

	@Override
	public List<Video> getVideoAll() {
		// TODO Auto-generated method stub
		return videoDao.findAll();
	}

	@Override
	public List<Video> findVideoByCate_code(String v_code) {
		// TODO Auto-generated method stub
		return videoDao.findVideoByV_code(v_code);
	}

}
