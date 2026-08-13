package datastructure.stack;

import java.util.Scanner;

public class StackMainMenu {

	public static void main(String[] args) {
		// stack 인터페이스 메뉴 구현
		
		Scanner stdIn = new Scanner(System.in);
		Stack stk;
		
		// 스택 용량 지정받기
			System.out.print("필요 용량 입력(양수) : ");
		int stackSize = stdIn.nextInt();
		stk = new Stack(stackSize);
		while(true) {
			System.out.println("===============================");
			System.out.println("1. 푸시");
			System.out.println("2. 팝");
			System.out.println("3. 최근 값 확인");
			System.out.println("4. 스택 확인");
			System.out.println("5. 현재 데이터량");
			System.out.println("6. 스택 크기");
			System.out.println("7. 종료");
			System.out.println("===============================");
			
			int menu = stdIn.nextInt();
			if (menu == 7) {
				System.out.println("종료합니다.");
				break;
			}
			
			char x;
			switch(menu) {
				case 1 :
					System.out.println("푸시할 데이터 입력 : ");
					x = stdIn.next().charAt(0);
					try {
						stk.push(x);
					} catch(Exception e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					System.out.println("푸시 성공!");
					break;
				case 2 :
					try {
						stk.pop();
					} catch(Exception e) {
						System.out.println("스택이 비어 삭제에 실패하였습니다.");
					}
					System.out.println("팝 성공!");
					break;
				case 3 :
					try {
						stk.peek();
					} catch(Exception e) {
						System.out.println("스택이 비어 출력에 실패하였습니다.");
					}
					System.out.println("최근에 넣은 데이터 : " + stk.peek());
					break;
				case 4 :
					try {
						stk.showStack();
					} catch(Exception e) {
						System.out.println("스택이 비어 출력에 실패하였습니다.");
					}
					break;
				case 5 :
					System.out.println("데이터의 총 갯수 : " + stk.size());
					break;
				case 6 :
					System.out.println("스택의 크기 : " + stk.getCapacity());
					break;
			}
		}
	}

}
