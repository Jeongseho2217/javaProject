package operators;

import java.util.Scanner;

public class ArithmeticOpEtc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 산술 연산
		
		int n1, n2;

		System.out.print("정수 1 입력 : ");
		n1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println();
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
		// 결과값 산출 시 오버플로우 주의 (에러가 안뜨고 가비지 값이 출력됨) <- 더 위험
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y;
		System.out.println(z); // -727379968 출력. int의 처리 최대값 넘어감
		
		//System.out.println(10/0); // by zero 1이것도 잘못된 런타임 오류인데 컴파일 시점엔 오류로 안잡힘
		//System.out.println(10/0.0); // Infinity
		
		//System.out.println(10%0); // by zero 2이것도 잘못된 런타임 오류인데 컴파일 시점엔 오류로 안잡힘
		//System.out.println(10%0.0); // NaN
		System.out.println(10+20+"30"); // 산술 > 결합 3030 문자열이 있으면 문자열 결합
		System.out.println("30"+20+10); // 결합 > 산술 302010
	}

}
