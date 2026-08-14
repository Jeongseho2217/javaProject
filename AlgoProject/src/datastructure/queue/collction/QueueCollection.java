package datastructure.queue.collction;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		// 자바 : 큐 인터페이스 제공 구현은 링크드리스트
		// equeue - add(), dequeue - poll()

		Queue<String> q = new LinkedList<String>();
		
		System.out.println("큐에 4개 값 삽입");
		
		q.add("길동");
		q.add("춘양");
		q.add("몽룡");
		
		q.offer("철수");
		
		// Queue toString 재정의 되어 있음
		System.out.println("\n 큐의 내용 출력");
		System.out.println(q);
		
		System.out.println("\n 큐의 크기(저장된 원소 수)" + q.size());
		System.out.println("\n 첫번째 값 : " + q.peek());
		
		System.out.println("\n 큐의 삭제" + q.poll());
		System.out.println(q);
		System.out.println("\n 큐 삭제" + q.remove());
		System.out.println(q);
		
		System.out.println("\n 검색값이 없을 경우 큐 삭제" + q.remove("철수"));
		System.out.println(q);
		
		System.out.println("\n 검색값이 없을 경우 큐 삭제" + q.remove("철수"));
		System.out.println(q);
	}

}
