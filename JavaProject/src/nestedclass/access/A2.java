package nestedclass.access;


// 멤버 클래스 종류에 따라 바깥 클래스 멤버를 접근할 때 제약
public class A2 {
	
	// 바깥 클래스인 A2의 인스턴스 멤버 필드
	int field1;
	void method1() {};
	
	// 바깥 클래스 A2의 정적 멤버 필드, 메소드
	static int field2;
	static void method2() {};
	
	class B2{ // 인스턴스 멤버 클래스 메서드에서 바깥 클래스 필드와 메서드 종류 상관없이 접근해서 사용 가능
		void method() {
			field1 = 3;
			method1();
			field2 = 2;
			method2();
		}
	}
	
	static class C2 { // 정적 멤버 클래스 바깥 클래스 필드와 메소드 종류 상관없이 접근해서 사용가능한지?
		// 정적 멤버 클래스 메서드에서 바깥 클래스의 인스턴스 필드와 메소드는 사용이 불가능.
		void method() {
			//field1 = 3; // 인스턴스는 사용 불가
			//method1();
			field2 = 2; // 정적만 사용 가능
			method2();
		}
	}
}
