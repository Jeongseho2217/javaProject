package datastructure.queue.Generic;

public class MyQueueMain {

	public static void main(String[] args) {
		int queueSize = 3;
		
		MyQueueMoveGeneric<String> q = new MyQueueMoveGeneric<String>(queueSize);
		
		q.showQueue();
		System.out.println("데이터 수 : " + q.size());
		
		System.out.println("\n아무 문자열 삽입");
		q.enqueue("1234");
		q.enqueue("abt");
		q.enqueue("$%@");

		q.showQueue();
		System.out.println("\n데이터 수 : " + q.size());
		
		System.out.println("\n첫번째 값 확인 " + q.peek());
		
		System.out.println("\n값 삭제, 삭제된 값 : " + q.dequeue());
		System.out.println("\n값 삭제, 삭제된 값 : " + q.dequeue());
		q.showQueue();
		System.out.println("\n데이터 수 : " + q.size());
		
		System.out.println("\n첫번째 값 확인 " + q.peek());
		
		System.out.println("\n아무거나 삽입");
		q.enqueue("ㅁㄴㅇㄹ");
		q.showQueue();
		
		System.out.println("\n" + q.contains("ㅁㄴㅇㄹ"));
		/*
		System.out.println("\nd, e 삽입");
		q.enqueue('d');
		q.enqueue('e');
		
		q.showQueue();
		System.out.println("\n데이터 수 : " + q.size());
		
		System.out.println("\nf 삽입");
		q.enqueue('f'); // 데이터가 4개이고 0 위치가 비었음에도 full 출력
		// -> rear와 queueSize - 1이 동일하면 오버플로우가 발생
		// -> 해결법: 이동큐 원형큐
		System.out.println("\nClear 수행");
		q.clear();
		q.showQueue();
		
		System.out.println("\nx 삽입");
		q.enqueue('x');
		q.showQueue();
		*/
	}

}
