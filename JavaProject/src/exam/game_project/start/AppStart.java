package exam.game_project.start;

import java.util.Scanner;

public class AppStart {
	public static void main(String[] args) {
		//프로그램 시작과 끝
		// 게임 웰컴 문구
		// 메뉴 출력
		// 1. 게임정보, 2. 가위바위보게임, 3. 숫자 맞히기 게임, 4. 종료
		// 메뉴 선택
		
		// 선택된 메뉴의 기능을 수행
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("	** 게임에 오신 것을 환영합니다.^^		");
		System.out.println("************************************");
		
		while(true) {		
			System.out.println("		메뉴");
			System.out.println("------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("------------------------------------");
			System.out.print("메뉴 번호 입력 : ");
			int input = sc.nextInt();
			System.out.println("************************************");
			switch(input) {
				case 1: {
					break;
				}
				case 2: {
					break;
				}
				case 3: {
					break;
				}
				case 4: {
					System.out.println("종료합니다!");
					System.out.print("************************************");
					sc.close();
					return;
				}
			}
		}
	}
}
