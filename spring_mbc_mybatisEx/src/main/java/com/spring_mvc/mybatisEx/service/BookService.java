package com.spring_mvc.mybatisEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.spring_mvc.mybatisEx.dao.IBookDAO;
import com.spring_mvc.mybatisEx.vo.BookVO;

@Service
public class BookService implements IBookService{
	@Autowired
	@Qualifier("IBookDAO")
	IBookDAO dao;

	@Override
	public String bookNoCheck(String bookNo) {
		String res = dao.bookNoCheck(bookNo);
		String result = "available";
		if(res != null) return result;
		return res;
	}

	@Override
	public void insertBook(BookVO prdDto) {
		dao.insertBook(prdDto);
	}

	@Override
	public void updateBook(BookVO prdDto) {
		dao.updateBook(prdDto);
		
	}

	@Override
	public void deleteBook(String prdNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BookVO> listAllBook() {
		// TODO Auto-generated method stub
		return dao.listAllBook();
	}

	@Override
	public BookVO detailViewBook(String prdNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookVO> bookSearch(HashMap<String, Object> map) {
		return dao.bookSearch(map);
	}
	
}
