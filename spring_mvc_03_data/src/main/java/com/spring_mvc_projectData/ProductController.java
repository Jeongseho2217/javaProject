package com.spring_mvc_projectData;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@RequestMapping("product/productForm")
	public String productFormView() {
		return "product/productForm3";
	}
	
	@RequestMapping("/product/productDetailView/{prdName}")
	public String productDetailView(@PathVariable String prdName) {
		System.out.println(prdName);
		return "product/productResult5";
	}
	
	@RequestMapping("/product/productDetailView/{prdNo}/{prdName}/{prdStock}")
	public String productDetailView(@PathVariable String prdNo,
			@PathVariable String prdName,
			@PathVariable String prdStock) {
		System.out.println(prdNo + "," + prdName + "," + prdStock);
		return "product/productResult5";
	}
	
	@RequestMapping("/product/productSearch")
	public String productSearch(@RequestParam HashMap<String, Object> param) {
		
		// param 값 출력 : key로 value 찾아서 출력 -> 파라미터명이 key, 파라미터값 value
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));
		
		// 검색결과를 view에 전달하기 위한 준비
		Product vo1 = new Product();
		vo1.setNo("1001");
		vo1.setName("TV");
		vo1.setPrice(3500000);
		vo1.setYear(2019);
		vo1.setPub("삼성");
		vo1.setStock(5);
		
		Product vo2 = new Product();
		vo1.setNo("1002");
		vo1.setName("스마트폰");
		vo1.setPrice(350000);
		vo1.setYear(2022);
		vo1.setPub("LG");
		vo1.setStock(3);
		
		ArrayList<Product> prdList = new ArrayList<Product>();
		prdList.add(vo1);
		prdList.add(vo2);
		
		model.addAttribute("prdList", prdList);
		return "product/productSearchResult";
	}
	

	public String insertProduct(HttpServletRequest request, Model model) {
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String pub = request.getParameter("pub");
		String year = request.getParameter("year");
		String stock = request.getParameter("stock");
		
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("pub", pub);
		model.addAttribute("year", year);
		model.addAttribute("stock", stock);
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/newProduct2")
	public String insertProduct2(
			@RequestParam("no") String no,
			@RequestParam("name") String name,
			@RequestParam("price") String price,
			@RequestParam("pub") String pub,
			@RequestParam("year") String year,
			@RequestParam("stock") String stock,
			Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("pub", pub);
		model.addAttribute("year", year);
		model.addAttribute("stock", stock);
		return "product/productResult2";
	}

	@RequestMapping("/product/newProduct3")
	public String insertProduct3(String no,
								 String name,
								 String price,
								 String pub,
								 String year,
								 String stock,
								 Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("pub", pub);
		model.addAttribute("year", year);
		model.addAttribute("stock", stock);
		return "product/productResult3";
	}
	
	@RequestMapping("/student/newProduct4")
	public String insertStudent4(@ModelAttribute("studentInfo") Student student) {
		return "/student/studentResult4";
	}
}
