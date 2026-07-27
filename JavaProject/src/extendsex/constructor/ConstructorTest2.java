package extendsex.constructor;

class A1 {
	
	public A1() { // 상속 받는게 없으므로 바로 실행 후 호출한 쪽으로 주소를 리턴
		System.out.println("기본 생성자 A");
	}
}

class B1 extends A{
	public B1() {
		System.out.println("기본 생성자 B");
	}
	
	public B1(int x) {
		System.out.println("매개변수 생성자 B : " + x);
	}
}

class C1 extends B1{ // B가 A를 상속 받기 때문에 C는 A, B를 모두 상속 받음
	public C1() {
		// 명시적으로 상위  클래스 생성자 호츌 super()메소드 이용
		super(10); // B클레스의 생성자를 명시적 호출
		System.out.println("기본 생성자 C");
		// super(200); // 상위 클래스는 무조건 첫라인에서 생성하여야 함.
	}
}

public class ConstructorTest2 {

	public static void main(String[] args) {
		// C클래스 객체 인스턴스 생성 (생성자 호출)
		C1 c1 = new C1(); // 인스턴스 생성 시 C클래스 생성자 호출
		// C1호출 -> B1호출 -> A1호출 -> A1출력 -> B1출력 -> C1출력
	}

}
