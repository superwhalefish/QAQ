package com.ly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Catevideo;
import com.ly.spring.entity.Video;
import com.ly.spring.service.VideoService;

@RestController
public class videoController {
	@Autowired
	private VideoService videoService;

	@GetMapping("getVideoAll")
	public List<Video> getVideoAll() {
		return videoService.getVideoAll();

	}
	@PostMapping("findVideoByCate_code")
	public List<Video> findVideoByCate_code(String cate_code){
		return videoService.findVideoByCate_code(cate_code);
		
	}
}
