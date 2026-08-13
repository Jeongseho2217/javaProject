package exam;

import java.util.Scanner;

public class StackParking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack stk;
		System.out.println("주차장을 구성합니다");
		System.out.print("주차 면을 입력하세요 : ");
		int size = sc.nextInt();
		
		char A = 'A';
		
		stk = new Stack(size);
		System.out.println(size + "대를 주차할 수 있는 주차장이 구성되었습니다.");
		
		System.out.println("자동차 주차 프로그램 실행 완료");
       
		try {
        	
			while(true) {
			System.out.println("버튼을 눌러주세요");
			System.out.print("0.주차현황 / 1. 자동차 주차 / 2. 자동차 출차 / 3. 만차여부 / 4. 종료 : ");
	        int input = sc.nextInt();
	        
		        switch(input) {
		        case 0:
		        	stk.showStack();
		        	break;
		        case 1:
		        	stk.push(A);
		        	System.out.println(A + " 자동차 주차 완료");
		        	A += 1;
		        	break;
		        case 2:
		        	stk.pop();
		        	A -= 1;
		        	System.out.println(A + " 자동차 출차 완료");
		        	break;
		        case 3:
		        	if (stk.isFull()) System.out.println("주차장이 만차입니다.");
		        	else System.out.println("현재 주차장에 자동차" + stk.size() + "대가 주차되어 있습니다. 여유공간이 존재합니다.");
		        	break;
		        case 4:
		        	System.out.println("프로그램을 종료합니다.");
		        	System.exit(0);
		        }
			}	
        }catch(Exception e) {
        	System.out.println("잘못 입력하셨습니다. 다시 재실행 해주세요.");
        }
    }
}
