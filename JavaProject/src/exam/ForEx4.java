package exam;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pl = 0;
		int mi = 0;
		int zero = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자" + i + " 입력 : ");
			int j = sc.nextInt();
			if (j > 0) {
				pl++;
			}
			else if (j < 0) {
				mi++;
			}
			else {
				zero++;
			}
		}
		
		System.out.println("양수 개수 : " + pl);
		System.out.println("음수 개수 : " + mi);
		System.out.println("0의 개수 : " + zero);
		
		sc.close();
	}

}
