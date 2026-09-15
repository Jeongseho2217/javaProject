package com.spring_mvc.jdbc2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc.jdbc2.Repo.ProductDAO;
import com.spring_mvc.jdbc2.dto.ProductDTO;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO prdDao;
	
	// 시작시 요청되는 index
	@RequestMapping("/")
	public String vieIndex() {
		return "Index"; // view 파일명 반환
	}
	
	// 요청 -> 비지니스 로직 처리 -> view 반환
	@RequestMapping("/product/productSelect")
	public String selectMember(Model model) {
		// dao 반환 결과값을 받는 참조변수
		ArrayList<ProductDTO> prdList = prdDao.memberSelect();
		
		model.addAttribute("prdList", prdList);
		return "product/productListView";
	}
	
}
