package exam;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int stus = sc.nextInt();
		
		double av = 0;
		double sum = 0;
		
		for(int i = 1; i <= stus; i++) {
			System.out.print("학생" + i + " 점수 입력 : ");
			int j = sc.nextInt();
			sum += j;
		}
		
		av = sum / stus;
		
		System.out.println("평균 : " + av);
		
		sc.close();
	}

}
