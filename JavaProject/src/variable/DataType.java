package variable;

public class DataType {

	public static void main(String[] args) {

		// 정수 타입 : 기본 타입 int, long 형은 기본 타입이 아니기 때문에 리터럴 뒤에 l, L을 붙혀야함
		
		// 100은 어떤 타입이던 표현가능한 리터럴이므로 long에 넣을 때 l/L이 필요 없음
		int four = 100; // 4byte
		long eight = 100; // 8Byte
		
		// 100010001000100 처럼 4바이트보다 큰 수는 안들어가니까 L을 뒤에 붙혀 Long이라고 명시 해줘야 함
		long longValue = 100010001000100L;
		
		char a = 'A'; // 문자 A
		char b = 65; // 문자 A의 아스키 코드
		char c = '\u0041'; // 문자 A의 유니코드
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// float 4바이트 / double 8바이트 <-- 얘는 더 큰 double이 기본 타입임
		// 8바이트 값을 4바이트 변수에 넣으려 하면 문제 발생, float을 쓸 때 f나 F를 뒤에 붙여줘야함
		
		double avg = 88.5;
		float avg1 = 88.5f;
		
		double doubleValue = 0.1234567890123456789;
		float floatValue = 0.1234567890123456789f;
		
		System.out.println("doubleValue : " + doubleValue);
		System.out.println("floatValue : " + floatValue);
		
		// 지수와 가수 표현
		int var1 = 3000000;
		double var2 = 3000000;
		double var3 = 3e6; // 3e6 e6 --> 0이 6개 있다는 뜻 = 3백만
		float var4 = 3e6f; // f붙이기
		double var5 = 3e-6;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
		String name = "홍길동"; // 홍길동은 메모리 주소에 저장, name 변수에는 홍길동이 저장된 시작 주소를 저장
		String addr = "전주시 완산구 삼천동"; // name의 크기와 addr의 크기는 같음
	}
}
