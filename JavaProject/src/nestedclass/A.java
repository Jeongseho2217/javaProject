package nestedclass;

public class A { // 바깥 클래스 
	A() { // 생성자 A
		System.out.println("A 객체가 생성됨"); // 생성자 함수
	}
	
	/**인스턴스 멤버 클래스 : 바깥 클래스 객체를 생성해야 접근(객체 생성) 가능 **/
	public class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		void method1() {}
		// 정적 필드 메소드 선언 불가
		// static int field2; 런타임 에러 발생함 사용금지
		// static void method2() {} 런타임 에러 발생함 사용금지
	}
	
	/**정적(static) 멤버 클래스* : 인스턴스 필드, 메소드 정적 필드, 메소드 모두 가능
	 * 바깥 클래스 객체 없이 C클래스의 객체 생성이 가능 -> 바깥 클래스명을 통해 생성 가능
	 * **/
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		void method1() {}
		static int field2;
		static void method2() {};
	}
	
	/**로컬(method 내부에 선언) 클래스**/
	void method() {
		/** 로컬 클래스 **/
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {} // static 필드, 메소드 불가
		}
		D d = new D(); // 현 시점(메소드 호출되면)에서 생성 메소드 실행이 종료되면 제거됨
		d.field1 = 3;
		d.method1();
	} // 여기서 Class가 사라짐
}
