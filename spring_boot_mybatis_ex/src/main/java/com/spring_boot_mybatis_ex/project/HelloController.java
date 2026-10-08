package com.spring_boot_mybatis_ex.project;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
	@GetMapping("/") // localhost:8080
	public String index() {
		return "index";
	}
	
	@GetMapping("/hello") // localhost:8080/hello
	public String home(Model model) {
		model.addAttribute("message", "Hello");
		return "home";
	}
}
