package interfaceex.extend;

public class MultiExtendsInterfaceMain {
	public static void main(String[] args) {
		// 인터페이스 상속에서의 다형성
		
		// 구현클래스 객체 생성
		ImplementationC c = new ImplementationC();
		
		// 인터페이스 참조변수에 대입
		// A와 B는 동일 계층
		// C는 A, B의 하위 계층
		InterfaceA ia = c;
		ia.methodA(); // ia = A메소드만 사용 가능
		
		InterfaceB ib = c;
		ib.methodB(); // ib = B메소드만 사용 가능
		
		System.out.println("---------------------------");
		
		
		InterfaceC ic = c; // 자신의 추상 메소드 구현체에 접근
		ic.methodA(); 
		ic.methodB(); 
		ic.methodC(); // ic = A, B, C메소드 모두 사용 가능
		
		c.methodA(); 
		c.methodB(); 
		c.methodC(); // c 또한 A, B, C메소드 모두 사용 가능
	}
}
