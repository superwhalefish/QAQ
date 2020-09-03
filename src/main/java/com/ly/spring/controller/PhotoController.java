package com.ly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Photo;
import com.ly.spring.service.PhotoService;

@RestController
public class PhotoController {
	@Autowired
	private PhotoService photoService;

	@PostMapping("getPhoto")
	public List<Photo> getPhoto() {
		return photoService.getPhotoAll();

	}
	@PostMapping("getPhotoByP_code")
	public List<Photo> getPhotoByP_code(String p){
		return photoService.getPhotoByP_code(p);
		
	}
}
