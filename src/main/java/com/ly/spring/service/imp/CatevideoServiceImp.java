package com.ly.spring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.spring.dao.CatevideoDao;
import com.ly.spring.entity.Catevideo;
import com.ly.spring.service.CatevideoService;
@Service
public class CatevideoServiceImp implements CatevideoService {
@Autowired
	private CatevideoDao catevideoDao;
	@Override
	public List<Catevideo> getCatevideoAll() {
		// TODO Auto-generated method stub
		return catevideoDao.findAll();
	}

}
