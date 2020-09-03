package com.ly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Home;
import com.ly.spring.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	private HomeService homeService;

	@GetMapping("getHome")
	public List<Home> getHome() {
		
		return homeService.getHome();
	}
}
