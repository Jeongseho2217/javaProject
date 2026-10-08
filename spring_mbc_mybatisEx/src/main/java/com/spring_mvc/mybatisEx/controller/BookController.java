package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatisEx.service.BookService;
import com.spring_mvc.mybatisEx.vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	@RequestMapping("/book/listAllBook")
	public String viewIndex(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);
		return "/book/bookListView";
	}
	
	@RequestMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}

	@RequestMapping("/book/insertBook")
	public String insertBook(BookVO vo) {
		service.insertBook(vo); //완료신호 반환되면 저장되었다는 신호이므로 다음 내용 진행
		return "redirect:/product/listAllProduct";
	}
	
	@RequestMapping("/book/detailViewBook/{book.bookNo}")
	public String detailViewProduct(@PathVariable String bookNo, Model model) {
		BookVO vo = service.detailViewBook(bookNo);
		model.addAttribute("vo", vo);
		return "book/bookDetailView";
	}
	
	@RequestMapping("/book/updateBookForm/{bookNo}")
	public String updateBookForm(@PathVariable String bookNo, Model model) {
		BookVO vo = service.detailViewBook(bookNo);
		model.addAttribute("book", vo);
		return "book/updateBookForm";
	}
	
	@RequestMapping("/book/updateBook")
	public String updateBook(BookVO vo) {
		service.updateBook(vo);
		return "redirect:/book/listAllBook";
	}
	
	@RequestMapping("/book/deleteBook/{bookNo}")
	public String deleteBook(@PathVariable String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:/book/listAllBook";
	}
	
	// 파라미터 전달 방식
	@ResponseBody
	@RequestMapping("/book/bookNoCheck")
	public String bookNoCheck(@RequestParam("bookNo") String bookNo) {
		String result = service.bookNoCheck(bookNo); //상품번호 중복 체크 service에서 진행 결과만 반환
		return result;
	}
	
	// url data 전달 방식
	@ResponseBody
	@RequestMapping("/book/bookNoCheck1/{bookNo}")
	public String bookNoCheck1(@PathVariable String bookNo) {
		String result = service.bookNoCheck(bookNo);
		return result;
	}
	
	// post 방식의 request Body를 통해 data 전달
	@ResponseBody
	@RequestMapping("/book/bookNoCheck4")
	public String bookNoCheck4(@RequestBody String bookNo) {
		String result = service.bookNoCheck(bookNo);
		return result;
	}	
	
	// axios get 방식
	@ResponseBody
	@RequestMapping("/book/bookNoCheck5/{bookNo}")
	public String bookNoCheck5(@PathVariable String bookNo) {
		String result = service.bookNoCheck(bookNo);
		return result;
	}	
	
	// axios post 방식
	@ResponseBody
	@RequestMapping("/book/bookNoCheck6")
	public String bookNoCheck6(@RequestBody HashMap<String,String> map) {
		String bookNo = map.get("bookNo");
	String result = service.bookNoCheck(bookNo);
		return result;
	}
	// 상품 검색 기능
	// 폼 요청
	@RequestMapping("/book/bookSearchForm1")
	public String viewBookSearchForm1() {
		return "/book/bookSearchForm1";
	}
	
	// 검색1
	@RequestMapping("/book/bookSearch1")
	public ArrayList<BookVO> bookSearch1(@RequestParam HashMap<String, Object> map) {
		ArrayList<BookVO> bookList = service.bookSearch(map);
		
		return bookList;
	}
	
	// 폼 요청2
	@RequestMapping("/book/bookSearchForm2")
	public String viewBookSearchForm2() {
		return "/book/bookSearchForm2";
	}
	
	// 검색2
	@RequestMapping("/book/bookSearch2")
	public String bookSearch2(@RequestParam HashMap<String, Object> map, Model model) {
		ArrayList<BookVO> bookList = service.bookSearch(map);
		model.addAttribute("bookList", bookList);
	return "book/bookSearchResultView";
	}
	
	// 폼 요청3
	@RequestMapping("/book/bookSearchForm3")
	public String viewBookSearchForm3() {
		return "/book/bookSearchForm3";
	}
}
