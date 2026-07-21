package condition;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		int score = 85;
		//if 문 (조건이 참일 경우에만 확인)
		if(score>=90) 
			System.out.println("등급이 A 입니다."); // 중괄호 없을땐 얘만 실행
			System.out.println("언제 실행되는 문장인가요?"); //if 영역 아님
		
		if(score>=80) { 
			System.out.println("등급이 B 입니다."); // if 영역
			System.out.println("언제 실행되는 문장인가요?"); //if 영역
		}
		// if ~ else 문 (조건이 참인지 거짓인지 확인)
		if(score>=90)
			System.out.println("등급이 A 입니다."); // if 영역
		else
			System.out.println("등급이 A가 아닙니다.");
			System.out.println("언제 실행되는 문장인가요?"); // 조건에 상관없이 실행
		//
			
		if(score>=90) {
			System.out.println("등급이 A 입니다."); // if 영역
			System.out.println("이 문장은 실행 되나요?");
		}
		else
			System.out.println("등급이 A가 아닙니다.");
			System.out.println("언제 실행되는 문장인가요?"); // 조건에 상관없이 실행
		// 다중 if - else
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.print("점수 입력 (0~100) : ");
		score = sc.nextInt();
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.print("성적 : " + grade);
		sc.close();
	}
	
}
