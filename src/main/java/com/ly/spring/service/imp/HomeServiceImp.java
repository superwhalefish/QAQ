package com.ly.spring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.dao.HomeDao;
import com.ly.spring.entity.Home;
import com.ly.spring.service.HomeService;

@Service
public class HomeServiceImp implements HomeService {
	@Autowired
	private HomeDao homeDao;

	@Override
	public List<Home> getHome() {
		// TODO Auto-generated method stub
		return homeDao.findAll();
	}

}
