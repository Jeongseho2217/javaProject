package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stackSize = 5;
		
		Stack stk = new Stack(stackSize);
		
		System.out.print("스택 초기상태 : ");
		stk.showStack();
		
		System.out.print("\npop 수행");
		stk.pop();
		
		System.out.print("\npush a, b, c 수행 : ");
		stk.push('a');
		stk.push('b');
		stk.push('c');
		stk.showStack();
		
		System.out.print("\n최상위 값 반환 : " + stk.peek());
		
		System.out.print("\npush d, e 수행 : ");
		stk.push('d');
		stk.push('e');
		stk.showStack();
		
		System.out.print("\npush f 수행 : ");
		stk.push('f');
		
		System.out.print("\npop 2번 수행");
		stk.pop();
		stk.pop();
		stk.showStack();
		
		System.out.print("\nclear 수행");
		stk.clear();
		stk.showStack();
		
		System.out.print("\npop 수행");
		stk.pop();
		
		System.out.print("\npush h 수행 : ");
		stk.push('h');
		stk.showStack();
		
		System.out.print("\n스택의 데이터 개수 : " + stk.size());
		System.out.print("\n스택의 전체 용량 : " + stk.getCapacity());
		
		System.out.print("스택에서 pop한 data : " + stk.pop());
	}

}
