package classInfo;

public class ConstructorEx {

	public static void main(String[] args) {
		// 여러 형태의 생성자 사용 예시
		// 생성자가 없는 클래스 인스턴스 생성
		
		Constructor ct = new Constructor(); // 기본 생성자 호출
		 // 매개변수가 없는 명시적 생성자 호출
		Constructor1 ct1 = new Constructor1();
		// 매개변수가 있는 명시적 생성자 호출
		Constructor2 ct2 = new Constructor2(10, 20);
		// 파라미터에 따라 서로 다른 생성자 호출
		Constructor3 ct3 = new Constructor3(10, 20);
		Constructor3 ct3_1 = new Constructor3(); 
	}

}
