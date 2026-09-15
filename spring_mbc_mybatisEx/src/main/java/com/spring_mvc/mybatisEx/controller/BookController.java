package com.spring_mvc.mybatisEx.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
