package operators;

public class CompareOp {

	public static void main(String[] args) {
		// 비교 연산자
		// 대소 : < <= > >=
		// 동등 : == != 가중치 데이터에 대한 동등 비교
		
		int n1 = 10; int n2 = 10;
		
		boolean result1 = n1 == n2;
		
		System.out.println(n1 != n2);
		
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		System.out.println(char1>char2);
		
		String pass = "1234";
		String userPass = "1567";
		
		System.out.println(pass == userPass); // 문자열 비교 (권장하진 않음
		System.out.println(pass.equals(userPass)); // 대신 이걸 이용
	}

}
