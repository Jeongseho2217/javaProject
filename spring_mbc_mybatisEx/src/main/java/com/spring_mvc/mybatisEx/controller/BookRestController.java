package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;

@RestController
public class BookRestController {
	@Autowired
	BookService service;
	
	@RequestMapping("/book/bookSearch3")
	public ArrayList<BookVO> productSearch1(@RequestParam HashMap<String, Object> map) {
		ArrayList<BookVO> prdList = service.bookSearch(map);
		return prdList;
	}
}
