package exam;

import java.util.Scanner;

public class QueueParking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyQueueMove q;
		char carNo = 'N';
		
		int carParkTime = 0;
		
		System.out.println("주차장을 구성합니다");
		System.out.print("주차 가능 대수를 입력하세요 : ");
		int size = sc.nextInt();
		
		q = new MyQueueMove(size);
		System.out.println(size + "대를 주차할 수 있는 주차장이 구성되었습니다.");
		
		System.out.println("자동차 주차 프로그램 실행 완료");
       
		try {
        	
			while(true) {
			System.out.println("버튼을 눌러주세요");
			System.out.print("0.주차 여부 확인 / 1. 자동차 주차 / 2. 자동차 출차 / 3. 만차여부 / 4. 종료 : ");
	        int input = sc.nextInt();
	        
		        switch(input) {
		        case 0:
		        	System.out.print("차 문자를 입력하세요. : ");
		        	carNo = sc.next().charAt(0);
		        	if (q.contains(carNo) == -1) System.out.print("해당 차량은 주차되어 있지 않습니다.");
		        	else System.out.println(carNo + "해당 차량은" + q.contains(carNo) + "번째에 주차되어 있습니다.");
		        	break;
		        case 1:
		        	System.out.print("차 문자를 입력하세요. : ");
		        	carNo = sc.next().charAt(0);
		        	q.enqueue(carNo);
		        	System.out.println(carNo + " 자동차 주차 완료");
		        	break;
		        case 2:
		        	if (carParkTime < 60) {
		        		System.out.print("아직 주차한지 1시간이 안되었습니다.");
		        		break;
		        	}
		        	else {
		        		if (q.contains(carNo) == q.peek()) {
		        			q.dequeue();
		        			System.out.println(carNo + " 자동차 출차 완료");
		        		}
		        		else {
		        			q.dequeue();
		        			System.out.println("패널티!" + carNo + " 차량은 후순위로 밀립니다.");
		        		}
		        	}
		        	break;
		        case 3:
		        	if (q.isFull()) System.out.println("주차장이 만차입니다.");
		        	else System.out.println("현재 주차장에 자동차" + q.size() + "대가 주차되어 있습니다. 여유공간이 존재합니다.");
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
