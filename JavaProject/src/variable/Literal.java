package variable;

public class Literal {
	
	public static void main(String[] args) {
		int score = 95; // 정수 리터럴
		double average = 88.5; // 실수 리터럴
		char familyName = '김'; // 문자 리터럴
		String name = "홍길동"; // 문자열 리터럴
		boolean result = true; // 논리 리터럴
		
		// float average; 동일영역(메인 메소드)에 동일한 이름의 변수가 있을 경우 선언 불가
		
		System.out.println(result);
		System.out.println(name);
		
		// 위 변수들이 사용되는 범위 또는 메모리에서 내려오는 시점
		
	}
	{
		float average; // <-- 이건 가능
	}
}
