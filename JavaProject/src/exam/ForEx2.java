package exam;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수 입력 : ");
		int i = sc.nextInt();
		
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + " x " + j + " = " + i * j);
		}	
		sc.close();
	}
}
