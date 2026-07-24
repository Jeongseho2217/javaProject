package exam;

import java.util.Scanner;

public class Student {

	int stdNo;
	String stdName;
	int year;
	int score;

	void inputStdInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("****학생 정보 입력****");

		System.out.print("학번 : ");
		stdNo = sc.nextInt();
		System.out.print("성명 : ");
		stdName = sc.next();
		System.out.print("학년 : ");
		year = sc.nextInt();
		System.out.print("점수 : ");
		score = sc.nextInt();
		System.out.println();
		sc.close();
 	}

	void showStdInfo() {
		System.out.println("****학생 정보 출력****");

		System.out.println("학번 : " + stdNo);
		System.out.println("성명 : " + stdName);
		System.out.println("학년 : " + year);
		System.out.println("점수 : " + score);
	}


	public static void main(String[] args) {

		Student st = new Student();

		st.inputStdInfo();
		st.showStdInfo();

	}

}