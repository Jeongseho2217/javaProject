package variable;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 형변한
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte byteValue의 리터럴이 대입되는 시점에 정수타입으로 확장
		
		char charValue = '가';
		intValue = charValue; // 묵시적 형변환 2byte -> 4byte
		
		intValue = 500;
		long longValue = intValue; // 4byte -> 8byte 자동 형변환

		double doubleValue = intValue; // 작은 크기의 정수가 큰 크기의 실수로 저장
		System.out.println(doubleValue);
		
		// intValue = doubleValue; <- 큰쪽에서 작은쪽으로는 할당 불가 (데이터 손실, 강제 타입 변환 필요)

		// *캐스팅) 명시적 형변환
	}
}
