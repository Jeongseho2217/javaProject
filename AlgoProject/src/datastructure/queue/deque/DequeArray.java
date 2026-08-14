package datastructure.queue.deque;

// import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// java.util.Deque 인터페이스를 ArrayDeque로 구현
// 배열 기준이기 때문에 용량초과 overflow 발생 가능

public class DequeArray {
	public static void main(String[] args) {
		// = Deque<String> dq = new ArrayDeque<>();
		Deque<String> dq = new LinkedList<>(); // 중간 데이터의 삽입/삭제에 용이
		System.out.println("데이터 3개 삽입");
		dq.add("포도");
		dq.add("배");
		dq.add("수박");
		dq.offer("사과");
		System.out.println(dq);
		
		//Deque addFirst() : 앞쪽에서 삽입
		
		System.out.println("\n 앞쪽에 삽입");
		dq.addFirst("바나나");
		System.out.println(dq);
		dq.add("복숭아");
		System.out.println(dq);
		System.out.println("\n 뒤쪽에 삽입");
		dq.addLast("복숭아"); // 인덱스 끝에 추가
		System.out.println(dq);
		// deque에서의 peek는 인덱스가 제일 작은(0번 인덱스)의 값을 반환
		System.out.println("\npeek : " + dq.peek());
		System.out.println("\nsize : " + dq.size());
		
		// 데크 순회 : 배열 순회와 같음
		System.out.println("데크 순회");
		for(String item : dq) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n\n 데이터 꺼내기 ");
		System.out.println("\nremove : " + dq.remove());
		System.out.println(dq);
		
		// remove(값) : // 값이 있을 경우 true 반환. + 원하는 값 삭제 가능
		System.out.println("\nremove : " + dq.remove("사과"));
		System.out.println(dq);
		
		// remove(값) : // 값이 없을 경우 false 반환.
		System.out.println("\nremove : " + dq.remove("사과"));
		System.out.println(dq);
		// 동일 값이 여러개 있을 경우 인덱스가 작은 값을 제거
		System.out.println("\nremove : " + dq.remove("복숭아"));
		System.out.println(dq);
		// removeAll() : // true 반환 후 모든 원소 삭제 (값이 하나도 없을 경우 false 반환)
		System.out.println("\nremove : " + dq.removeAll(dq));
		System.out.println(dq);
		
		System.out.println("데이터 3개 삽입");
		System.out.println(dq.add("포도")); // add/offer는 데이터 삽입에 성공하면 true를 반환 용량 초과 시 예외 발생 Exception
		dq.add("배");
		dq.add("수박");
		System.out.println(dq.offer("사과"));
		System.out.println(dq);
		
		// 삭제 메소드 : poll
		System.out.println(dq);
		System.out.println("poll : " + dq.poll());
		System.out.println(dq);
		System.out.println("pollFirst : " + dq.pollFirst()); // 첫번째 데이터 삭제
		System.out.println(dq);
		System.out.println("pollLast : " + dq.pollLast()); // 마지막 데이터 삭제
		System.out.println(dq);
		
		//addFirst, pollFirst : front의 삽입과 삭제
		//addLast, pollLast : rear의 삽입과 삭제
		
		//데크를 스택처럼 사용가능 : pop/push
		System.out.println("push 수행");
		dq.push("밤");
		dq.push("밤");
		System.out.println(dq);
		dq.pop();
		System.out.println(dq);
	}
}