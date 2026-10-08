package com.spring_mvc.mybatisEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "ajax/loginForm";
	}
	
	@RequestMapping("/loginForm2")
	public String loginForm2() {
		return "ajax/loginForm2";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("id") String id,
							 @RequestParam("pw") String pw) {
		String result="";
		if(id.equals("abcd") && pw.equals("1234"))
			result ="success";
		else
			result = "fail";
		return result;
	}
}