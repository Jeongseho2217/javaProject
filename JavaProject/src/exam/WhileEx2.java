package exam;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int stus = sc.nextInt();
		
		double av = 0;
		double sum = 0;
		
		int i = 1;
		
		while (i <= stus) {
			System.out.print("학생" + i + " 점수 입력 : ");
			int j = sc.nextInt();
			sum += j;
			i++;
		}
		
		av = sum / stus;
		
		System.out.println("평균 : " + av);
		
		sc.close();
	}

}
