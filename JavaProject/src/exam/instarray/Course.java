package exam.instarray;

import java.util.Scanner;

public class Course {
	
	String sName;
	String pName;
	int grade;
	int score;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n과목명 : ");
		sName = sc.next();
		System.out.print("교수 : ");
		pName = sc.next();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("이수 학점 : ");
		score = sc.nextInt();
	}
	
	public void output() {
		System.out.print(sName + " ");
		System.out.print(pName + " ");
		System.out.print(grade + "학년 ");
		System.out.print(score + "학점");
		System.out.println();
	}
	
}
