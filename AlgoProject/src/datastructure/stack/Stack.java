package datastructure.stack;

// 배열을 활용한 스택 구현
// Char형 데이터를 저장하는 스택
public class Stack {
	private int stackSize; // 스택의 크기
	private int top; // 스택 포인터
	private char[] stackArr; // 스택
	
	// 생성자: 스택 초기화
	// 배열 index는 0부터 시작하므로 top은 -1로 초기값 설정
	
	public Stack(int stackSize) {
		this.stackSize = stackSize;
		this.top = -1;
		this.stackArr = new char[stackSize];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == stackSize - 1;
	}
	
	// 삽입시 오버플로우 체크
	public void push(char item) {
		if(isFull()) System.out.println("스택 오버플로우");
		else stackArr[++top] = item;
	}
	
	// 삭제시 언더플로우 체크
	public char pop() {
		if(isEmpty()) {
			System.out.println("스택 언더플로우");
			return 'E';
		}
		else return stackArr[top--];
	}
	
	// 저장된 데이터 중 가장 최근에 저장된 데이터를 반환
	public char peek() {
		if(isEmpty()) {
			System.out.println("데이터가 없음");
			return 'E';
		}
		else return stackArr[top];
	}
	
	public void clear() {
		if(isEmpty()) System.out.println("데이터가 없음");
		else {
			top = -1;
		}
	}
	
	public void showStack() {
		if(isEmpty()) {
			System.out.println("데이터가 없음");
		}
		else {
			System.out.print("스택 데이터 : ");
			for(int i = 0; i<=top; i++) {
				System.out.print("[" + i + "] : " + stackArr[i] + " ");
			}
			System.out.print("\ntop : " + top);
		}
	}
	
	// 연습문제
	public int size() {
		return top + 1;
	}
	
	public int getCapacity() {
		return stackSize;
	}
}
