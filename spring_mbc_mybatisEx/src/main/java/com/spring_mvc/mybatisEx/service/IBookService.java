package com.spring_mvc.mybatisEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_mvc.mybatisEx.vo.BookVO;

public interface IBookService {
	void insertBook(BookVO bookDto); // 도서 정보 등록
	void updateBook(BookVO bookDto); // 도서 정보 수정
	void deleteBook(String bookNo); // 도서 정보 삭제
	ArrayList<BookVO> listAllBook(); // 전체 도서 정보 조회
	BookVO detailViewBook(String bookNo); // 상세 도서 정보 조회
	String bookNoCheck(String bookNo); // 중복 체크
	ArrayList<BookVO> bookSearch(HashMap<String, Object> map); // 도서 검색
}
