package ref;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[3];
		int sum = 0;
		float avg = 0;
		
		System.out.println("점수 입력 : " );
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] : ", i);
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
		System.out.println("점수 합 : " + sum);
		System.out.println("점수 평균 : " + avg);
		System.out.printf("점수 평균 : %.2f", avg);
		
		sc.close();
	}

}
