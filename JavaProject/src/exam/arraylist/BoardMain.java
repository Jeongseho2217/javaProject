package exam.arraylist;

import java.util.ArrayList;
import java.util.List;

import collection.list.classuser.Product;

public class BoardMain {
	
	public static void main(String[] args) {
		List<Board> lists = new ArrayList<Board>();
		
		Board board1 = new Board("국어", "내용1", "홍길동");
		Board board2 = new Board("수학", "내용2", "김길동");
		Board board3 = new Board("영어", "내용3", "이길동");
		
		lists.add(board1);
		lists.add(board2);
		lists.add(board3);
		
		for(int i=0;i<lists.size();i++) {
			Board b = lists.get(i);
			System.out.println(b);
		}
	}
}
