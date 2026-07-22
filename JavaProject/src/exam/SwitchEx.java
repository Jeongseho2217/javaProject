package exam;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 (0~100) : ");
		int score = sc.nextInt();
		
		int grade = score / 10;  // 환산
		
		switch(grade) {
			case 10: {
			}
			case 9:{
				System.out.print("학점 : A"); break;
			}
			case 8: {
				System.out.print("학점 : B"); break;
			}
			case 7: {
				System.out.print("학점 : C"); break;
			}
			case 6: {
				System.out.print("학점 : D"); break;
			}
			default: {
				System.out.print("학점 : F");
			}
		}
		sc.close();
	}
}
