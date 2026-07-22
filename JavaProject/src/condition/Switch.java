package condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("학년 입력 : ");
		year = sc.nextInt();
		
		switch(year) {
			case 1: System.out.println("1학년"); break;
			case 2: System.out.println("2학년"); break;
			case 3: System.out.println("3학년"); break;
			case 4: System.out.println("4학년"); break;
			default: System.out.println("잘못입력");
		}
		sc.nextLine(); //nextInt가 처리 못한 enter값 처리
		System.out.print("직급 입력 : ");
		String position = sc.nextLine();  //nextLine은 공백 enter 포함 다 입력 받음
		
		switch(position) {
		case "부장": System.out.print("700만원"); break;
		case "과장": System.out.print("500만원"); break;
		case "대리": System.out.print("300만원"); break;
		default: System.out.println("200만원");
		}
		
		char grade = 'C';
		switch(grade) {
			case 'A':
			case 'B': System.out.println("참 잘했음"); break;
			case 'C':
			case 'D': System.out.println("노력하세요"); break;
			case 'F': System.out.println("재수강"); break;
			default : System.out.println("잘못된 학점");
		}

		sc.close();
	}

}
