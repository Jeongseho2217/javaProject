package datastructure.stack.generic;

import java.util.EmptyStackException;

// 어떤 타입이든 대입될 수 있도록 클래스로 구성, 객체 생성 시 타입 결정

public class StackGeneric <E>{
	private int stackSize; // 스택의 크기
	private int top; // 스택 포인터
	private Object[] stackArr; // Object로 먼저 구현 후 generic으로 형변환하여 모든 타입 처리 가능
	
	public StackGeneric(int stackSize) {
		this.stackSize = stackSize;
		this.top = -1;
		this.stackArr = new Object[stackSize]; // 오브젝트로 만들어두고 E[]타입으로 형변환
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == stackSize - 1;
	}
	
	// 여기서 generic으로 받기 / 삽입시 오버플로우 체크
	public void push(E item) {
		if(isFull()) System.out.println("스택 오버플로우");
		// obj 타입으로 배열에 저장 -> generi으로 해도 상관 없음.. item의 타입이 결정될 땐 결국 obj의 하위 타입이 될거이기 때문
		else stackArr[++top] = item;
	}
	

	public E pop() {
		if(isEmpty()) {
			System.out.println("스택 언더플로우");
			throw new EmptyStackException(); // 제네릭 타입을 반환해야 하는 경우 예외 상황이면 던져버리는 방법을 많이 사용
		}
		else {
			@SuppressWarnings("unchecked")
			E item = (E) stackArr[top--];
			return item; // obj타입을 e타입으로 형변환
		}
	}
	
	public E peek() {
		if(isEmpty()) {
			System.out.println("데이터가 없음");
			throw new EmptyStackException();
		}
		else {
			@SuppressWarnings("unchecked")
			E item = (E) stackArr[top];
			return item;
		}
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
	
	public int size() {
		return top + 1;
	}
	
	public int getCapacity() {
		return stackSize;
	}
}
