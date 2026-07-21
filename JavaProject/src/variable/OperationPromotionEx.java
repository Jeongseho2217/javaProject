package variable;

public class OperationPromotionEx {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// 정수 연산은 int 타입이 기본 (4바이트)
		// byte byteValue3 = byteValue1 + byteValue2; // 더한 결과가 int가 됨 그래서 type 미스매치가 뜬다
		int intValue = byteValue1 + byteValue2;
		//double result = intValue + doubleValue; // 다른 타입의 연산을 진행할 경우 큰 타입으로 자동 변환 
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char charValue3 = charValue1 + charValue2; // char 역시 더한 결과가 int가 됨 마찬가지로 type 미스매치가 뜬다
		int charValue3 = charValue1 + charValue2;
		
		System.out.println(charValue3);
		System.out.println((char)charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4; // int / int일 경우 소숫점 계산 x
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue = intValue5/4.0; // int/double 이므로 더 큰 범위인 double로 자동 변환 -> 결과 double
	
	}
}
