package variable;

public class CastingExamle {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue; // 강제 형변환 : (타입)
		
		System.out.println(charValue);
		
		intValue = 103029770;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue); // 데이터 손실 - 데이터 유지 x
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); // 데이터 손실 - 소수점 이하 삭제
		// int를 실수로 변환할때 float은 손실이 발생하므로(가수 부분이 작음) double을 사용하여야 함

	}
}
