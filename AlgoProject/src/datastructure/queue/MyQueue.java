package datastructure.queue;

//Queue
//데이터 삽입시 앞이 비었음에도 오버플로우 발생

public class MyQueue {
	private int queueSize;
	private int front; //첫번째 요소 앞
	private int rear; //마지막 요소
	private int num; // 현재 데이터 수
	private char[] queue; // 큐 본체
	
	// 생성자에서 초기화
	public MyQueue(int queueSize) {
		this.front = this.rear = - 1;
		this.num = 0;
		this.queueSize = queueSize;
		queue = new char[queueSize];
	}
	// front == rear 일 경우 데이터가 없다는 뜻
	public boolean isEmpty() {
		
		if (front == rear) {
			front = rear = -1; // 큐가 비었으니 모든 공간을 사용 가능 상태로 변경
		}
		return front == rear;
	}
	
	//rear 포인터가 큐의 마지막 인덱스와 동일하면 full 상태
	public boolean isFull() {
		return rear == queueSize - 1;
	}
	
	public void enqueue(char item) {
		if(isFull()) System.out.println("Queue Full"); // 마지막 저장된 데이터가 큐의 마지막 원소로 저장되면 full, front에서 삭제 후 비었어도 검증 x
		else queue[++rear] = item;
	}
	
	public char dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return 'E';
		}
		else {
			num--;
			front++;
			return queue[front]; // queue의 front 포인터는 삭제할 데이터의 앞 index를 참조하고 있습니다.
		}
	}
	
	// 큐의 첫번째 데이터 추출(저장된지 가장 오래된 data)
	public char peek() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return 'E';
		} else {
			return queue[front + 1];
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
	
	public int contains(char a) {	
		if (isEmpty()) System.out.println("Queue Empty");
		else {
			for(int i = front + 1; i <= rear; i++) {
				if (a == queue[i]) {
					//System.out.print("찾고자하는 문자 : " + a + "를 " + i + " 번째 인덱스에서 찾았습니다.");
					return i;
				}
			}
		}
		return -1; // 해당 value가 큐에 없음
	}
}
