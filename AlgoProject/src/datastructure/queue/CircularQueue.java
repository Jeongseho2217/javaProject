package datastructure.queue;

import java.util.Scanner;

public class CircularQueue {
	private int queueSize;
	private int front;
	private int rear;
	private int[] queueArr;
	Scanner sc;
	private int item;
	
	// 생성자 초기화(큐 크기 설정, 원형 큐는 공백/포화 상태를 표현하기 위해 1칸을 비워두므로 실제 저장공간 - 1 공간
	public CircularQueue(int queueSize) {
		this.queueSize = queueSize;
		front = 0; // 배열 1칸 비우기
		rear = 0;
		queueArr = new int[queueSize];
		sc = new Scanner(System.in);
	}
	
	public boolean isEmpty() { // 큐가 비었는지?
		return front == rear;
	}
	
	public boolean isFull() { // 큐가 가득찼는지?
		return (rear + 1) % queueSize == front;
	}
	
	// 데이터 삽입
	public boolean enqueue() {
		if(isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		System.out.print("enqueue data : ");
		int item = sc.nextInt();
		
		rear = (rear + 1) % queueSize;
		queueArr[rear] = item;
		System.out.println("Front : " + front + " Rear : " + rear);
		return true;
	}
	
	// 데이터 삭제
	
	public boolean dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return false;
		}		
		front = (front + 1) % queueSize;
		item = queueArr[front];
		queueArr[front] = 0;
		System.out.println("Front : " + front + " Rear : " + rear);
		return true;
	}
	
	// 삭제될 수 있는 data 값을 반환 (가장 앞에있는, 가장 먼저 저장된)
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}		
		return queueArr[(front+1)%queueSize];
	}
	
	public void print() {
		Q:while(true) {
			System.out.println("===========원형 큐===========");
			System.out.println("1.enque / 2. deque / 3. exit");
			System.out.print("선택 : ");
			int n = sc.nextInt();
			
			switch(n) {
				case 1:
					boolean checkEQ = enqueue();
					System.out.println("큐 현황");
					for(int i=0; i<queueArr.length; i++) {
						System.out.print(queueArr[i] + " ");
					}
					
					if(checkEQ) System.out.println("enqueue 성공");
					break;
				case 2:
					boolean checkDQ = dequeue();
					System.out.println("큐 현황");
					for(int i=0; i<queueArr.length; i++) {
						System.out.print(queueArr[i] + " ");
					}
					if(checkDQ) System.out.println("dequeue 성공 | item : " + this.item);
					break;
				case 3:
					System.out.println("종료");
					System.out.println("큐 현황");
					for(int i=0; i<queueArr.length; i++) {
						System.out.print(queueArr[i] + " ");
					}
					break Q;
			}
		}
	}
}
