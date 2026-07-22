package loop;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// 특정 조건에 대하여 계속 반복하는 프로그램
		Scanner sc = new Scanner(System.in);
		int input=0;
		String answer = "";
		
		System.out.println("과정 안내 프로그램");
		
		do {
			System.out.print("\n1~4 번호 입력 : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1: System.out.println("Java Programming"); break;
				case 2: System.out.println("Database"); break;
				case 3: System.out.println("BigData"); break;
				case 4: System.out.println("AI"); break;
				default: System.out.println("잘못 입력함");
			}
			System.out.print("\n 계속 조회할거야? (y/n) : ");
			answer = sc.next(); // do-while 종료 조건
		}while(answer.contentEquals("y")); // 입력받은 값이 y일때 계속 반복
		
		System.out.println("종료 합니다.");
		
		sc.close();
	}
}
