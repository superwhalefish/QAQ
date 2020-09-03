package com.ly.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreemarkerController {

	@GetMapping("index")
	public String index() {
		return "index";

	}

	@GetMapping("photo")
	public String photo() {
		return "photo";

	}

	@GetMapping("video")
	public String video() {
		return "video";

	}

	@GetMapping("contact")
	public String contact() {
		return "contact";

	}

	@GetMapping("login")
	public String login() {
		return "login";

	}

	@GetMapping("admin/index")
	public String adminIndex() {
		return "admin/index";

	}
	@GetMapping("admin/welcome")
	public String adminWelcome() {
		return "admin/welcome";
		
	}
}
