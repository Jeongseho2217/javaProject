package datastructure.queue.Generic;

import java.util.EmptyStackException;

public class MyQueueMoveGeneric <E>{
	private int queueSize;
	private int front; //첫번째 요소 앞
	private int rear; //마지막 요소
	private int num; // 현재 데이터 수
	private Object[] queue; // 큐 본체
	
	// 생성자에서 초기화
	public MyQueueMoveGeneric(int queueSize) {
		this.front = this.rear = - 1;
		this.num = 0;
		this.queueSize = queueSize;
		queue = new Object[queueSize];
	}
	// front == rear 일 경우 데이터가 없다는 뜻
	public boolean isEmpty() {
		
		if (front == rear) {
			front = rear = -1; // 큐가 비었으니 모든 공간을 사용 가능 상태로 변경
		}
		return front == rear;
	}
	
	//rear 포인터가 큐의 마지막 인덱스와 동일하고 데이터의 수가 size와 동일하면 full
	public boolean isFull() {
		return rear == queueSize - 1 && num == queueSize;
	}
	
	public void enqueue(E item) {
		if(isFull()) System.out.println("Queue Full"); // 마지막 저장된 데이터가 큐의 마지막 원소로 저장되면 full, front에서 삭제 후 비었어도 검증 x
		else if (rear == queueSize - 1 && num != 0) { // 이동이 필요한 경우
			// 배열 copy로 이동을 구현 -> System.arrayCopy(소스, 소스의 시작인덱스, 대상, 대상의 시작 인덱스, copy 할 원소수)
			// a 배열에서 a 배열로 copy 가능 - 새로운 배열 인스턴스 생성해서 기존 참조변수에 대입
			System.arraycopy(queue, front + 1, queue, 0, num);
			System.out.println("큐 이동 발생");
			front = -1; // 이동한 큐는 0번 인덱스 부터 값을 채움
			rear = num -1; // 이동한 큐의 원소는 기존 배열의 데이터 수임,로 데이터수 - 1 인덱스
			queue[++rear] = item;
			num++;
		}
		else{ // rear != queueSize-1 -> rear포인터 뒤에 공간이 있음
			queue[++rear] = item;
			num++;
		}
	}
	
	public E dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			throw new EmptyStackException();
		}
		else {
			num--;
			front++;
			@SuppressWarnings("unchecked")
			E item = (E)queue[front];
			return item; // queue의 front 포인터는 삭제할 데이터의 앞 index를 참조하고 있습니다.
		}
	}
	
	// 큐의 첫번째 데이터 추출(저장된지 가장 오래된 data)
	public E peek() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			throw new EmptyStackException();
		} else {
			@SuppressWarnings("unchecked")
			E item = (E)queue[front + 1];
			return item;
		}
	}
	
	// 큐 초기화
	public void clear() {
		front = rear = -1;
		System.out.println("Clear");
	}
	
	public int size() { // 큐에 저장된 데이터 수 반환
		return num;
	}
	
	public void showQueue() {
		if(isEmpty()) System.out.println("Queue Empty");
		else {
			System.out.print("Queue Items : ");
			for (int i = front + 1; i <= rear; i++) {
				System.out.print(i + ":" + queue[i] + " ");
			}
			System.out.print(" ");
		}
	}
	
	public int contains(E a) {
			
		if (isEmpty()) System.out.println("Queue Empty");
		else {
			for(int i = front + 1; i <= rear; i++) {
				if (a == queue[i]) {
					return i;
				}
			}
		}
		return -1;
	}
}
