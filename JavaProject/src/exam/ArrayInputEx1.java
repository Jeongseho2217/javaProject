package exam;

import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자 입력");
		int[] num = new int[5];
		int max = 0;
		
		for(int i = 0; i<num.length;i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = sc.nextInt();
			if (max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println();
		System.out.print("입력된 값 : ");
		for(int i = 0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.print("최대값 : " + max);
		
		sc.close();
	}

}
