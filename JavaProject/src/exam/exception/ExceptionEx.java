package exam.exception;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int res;
		
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		try {
			res = num1 / num2;
			System.out.println("나누기 결과 : " + res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	sc.close();
	}
}
