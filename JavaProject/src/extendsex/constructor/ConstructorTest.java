package extendsex.constructor;

class A {
	
	public A() { // 상속 받는게 없으므로 바로 실행 후 호출한 쪽으로 주소를 리턴
		System.out.println("기본 생성자 A");
	}
}

class B extends A{
	public B() {
		//B가 A를 상속받았으니 먼저 컴파일러에 의해 자동 생성된 A클래스의 생성자 호출
		System.out.println("기본 생성자 B");
	}
	
	public B(int x) {
		//생성자 오버로딩
		System.out.println("매개변수 생성자 B : " + x);
	}
}

class C extends B{ // B가 A를 상속 받기 때문에 C는 A, B를 모두 상속 받음
	public C() {
		//C가 B를 상속받았으니 먼저 컴파일러에 의해 자동 생성된 B클래스의 생성자 호출
		System.out.println("기본 생성자 C");
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// C클래스 객체 인스턴스 생성 (생성자 호출)
		C c = new C(); // 인스턴스 생성 시 C클래스 생성자 호출
		// C호출 -> B호출 -> A호출 -> A출력 -> B출력 -> C출력 

	}

}
