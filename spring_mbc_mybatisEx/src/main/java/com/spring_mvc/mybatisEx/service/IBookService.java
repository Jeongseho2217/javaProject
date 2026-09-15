package com.spring_mvc.mybatisEx.service;

import java.util.ArrayList;

import com.spring_mvc.mybatisEx.vo.BookVO;

public interface IBookService {
	void insertBook(BookVO prdDto); // 도서 정보 등록
	void updateBook(BookVO prdDto); // 도서 정보 수정
	void deleteBook(String prdNo); // 도서 정보 삭제
	ArrayList<BookVO> listAllBook(); // 전체 도서 정보 조회
	BookVO detailViewBook(String prdNo); // 상세 도서 정보 조회
}
