package exam;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int num1  = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2  = sc.nextInt();
		System.out.print("숫자3 입력 : ");
		int num3  = sc.nextInt();
		
		if (num1 > num2) { // 2보다 1이 크고
			if (num1 > num3)
				System.out.println("가장 큰 수 : " + num1);// 3보다도 1이 크면 1이 큼
			else
				System.out.println("가장 큰 수 : " + num3); // 3보단 작으면 3이 큼
		}
		else {
			if (num2 > num3) // 2가 1보다 크고
				System.out.println("가장 큰 수 : " + num2); // 2가 3보다 크면 2가 큼
			else
				System.out.println("가장 큰 수 : " + num3); // 아니면 3이 큼
		}
		
		sc.close();
	}

}
