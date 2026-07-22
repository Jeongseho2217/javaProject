package exam;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			switch(num) {
				case 1: {
					System.out.print("예금액>");
					int add = sc.nextInt();
					money += add;
					break;
				}
				case 2: {
					System.out.print("출금액>");
					int minus = sc.nextInt();
					money -= minus;
					break;
				}
				case 3: {
					System.out.println("잔고>" + money);
					break;
				}
				case 4: {
					System.out.println();
					System.out.print("프로그램 종료");
					sc.close();
					return;
				}
			}
		}
	}
}
