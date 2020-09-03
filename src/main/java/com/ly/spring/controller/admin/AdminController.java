package com.ly.spring.controller.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Background;
import com.ly.spring.entity.Home;
import com.ly.spring.service.AdminBackgroundService;
import com.ly.spring.service.HomeService;

@RestController
public class AdminController {
	@Autowired
	private HomeService homeService;
@Autowired
	private AdminBackgroundService adminBackgroundService;
	@GetMapping("admin/getAdminHome")
	public List<Home> getAdminHome() {
		return homeService.getHome();
	}
	@PostMapping("admin/getAdminBackground")
	public Map<String,Object> getAdminBackground(Integer page,Integer limit,Background background) {
		return adminBackgroundService.getAdminBackground(page,limit,background);
		
	}
}
