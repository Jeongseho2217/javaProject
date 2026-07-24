package classInfo;

public class StaticInfo {
	// 인스턴스 멤버 필드와 멤버 메소드
	int a;
	void f1(int x) {
		a=x; 
	} // 인스턴스 메소드내에서 인스턴스 필드 사용 가능
	void f2(int x) {
		b=x; // 인스턴스 메소드내에서  static 필드 사용 가능
	}
	
	// static 멤버 필드와 멤버 메소드 / 제약 조건
	// static메소드는 static 멤버만 접근 가능
	static int b;
	static void s1(int x) { // static 메소드에서 인스턴스 필드 사용
		// a = x; // 사용 불가
	}
	static void s2(int x) { // static 메소드에서 인스턴스 메소드 호출
		// f1(3); // 사용 불가
	}
	static void s3(int x) { // static 메소드에서 static 필드 사용
		b=x; // 사용 가능
	}
	static void s4(int x) { // static 메소드에서 static 메소드 호출
		s1(1); // 사용 가능
	}
	
	//--------------------------------------------------------
	// static 멤버 선언 : static 키워드 사용 (명시적 선언)
	static int staticVar; // static field
	static void staticMethod() {} // static method
}

//--------------------------------------------------------
// static 초기화 블록
// 클래스가 메소드 영역으로 로딩될 때 자동으로 실행하는 블록
// 클래스 내부에 여러개가 선언되면 선언된 순서대로 실행
class Test{
	static {
		//static 초기화 블록 - static 필드를 초기화
	}
	{
		// 인스턴스 멤버 초기화 블록 - 거의 사용하지 않는다.
	}
}

class Television{
	int a; // 인스턴스 멤버
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	// info = company + "-" + model; <-- 일반 연산 처리 에러
	static {
		// 단순 값을 입력하는 초기화가 아니라 복잡한 연산을 진행해야하는 경우
		info = company + "-" + model;
	}
	{ // 인스턴스 멤버 초기화 블럭을 사용 할 수 있지만 , 생성자 함수를 사용 가능하기 때문에 굳이?
		a = 10 + 50;
	}
}

// static 블럭 사용시 주의점

class Test10 {
	// Instance field and Method
	int a;
	void method() {/*...*/}
	// Static field and Method
	static int staticA;
	static void staticMethod() {}
	
	static {
		// a=1; // 인스턴스 필드 사용 불가
		// method(); // 인스턴스 메소드 사용 불가
		staticA=10;
		staticMethod();
	}
	
	static void staticMethod2() {
		// this.a=10; //this는 인스턴스 참조하기 때문에 static에서는 사용 불가능
		// 정 쓰고 싶으면 아래와 같이 static 메소드에서 인스턴스필드 또는 인스턴스 메소드 사용하려면 인스턴스 생성 후 사용
		Test10 t10 = new Test10();
		t10.a = 10;
		t10.method();
	}
}
