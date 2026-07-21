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
		
	}

}
