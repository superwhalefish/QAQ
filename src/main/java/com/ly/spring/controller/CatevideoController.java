package com.ly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.entity.Catevideo;
import com.ly.spring.service.CatevideoService;

@RestController
public class CatevideoController {
	@Autowired
	private CatevideoService catevideoService;

	@GetMapping("getCatevideo")
	public List<Catevideo> getCatevideo() {
		return catevideoService.getCatevideoAll();

	}
	
}
