package datastructure.queue.parking;

import java.util.Scanner;

public class QueueParking {

	public static void main(String[] args) {
		parkingMenu();

	}

	private static void parkingMenu() {
		Scanner sc = new Scanner(System.in);
		MyQueue parking = new MyQueue(5);
		
		MENU:while(true) {
			System.out.println("Select Menu : ");
			System.out.print("0.주차 여부 확인 / 1. 자동차 주차 / 2. 자동차 출차 / 3. 만차여부 / 4. 종료 : ");
	        String sel = sc.nextLine();
	        
	        switch(sel) {
		        case "0" :
		        	System.out.print("차량 고유 번호 입력 : ");
		        	char carChar = sc.nextLine().charAt(0);
		        	int num = parking.contains(Character.toLowerCase(carChar));
		        	if (num < 0) System.out.print("차량이 없습니다.");
		        	else System.out.print("이 차량은" + (num+1) + "번째 출차 가능 합니다.");
		        	break;
		        case "1" :
		        	System.out.print("차량 고유 번호 입력 : ");
		        	char chr = sc.nextLine().charAt(0);
		        	if (parking.contains(Character.toLowerCase(chr)) == -1) {
		        		if (parking.enqueue(Character.toLowerCase(chr))) System.out.println("차량 완료");
		        		else System.out.println("주차 불가");
		        	}
		        	else System.out.println("이미 주차 됨");
		        	break;
			    case "2" :
			    	System.out.println("고유값 입력");
			    	char chr1 = sc.nextLine().charAt(0);
			    	
			    	char parkChar = parking.peek();
			    	if (parkChar != 'E') {
				    	if(Character.toLowerCase(chr1) == parkChar) {
				    		System.out.println("출차 진행");
				    		parking.dequeue();
				    	} else {
				    		System.out.println("출차 불가 : 주차시간이 1시간 지난 경우 출차 가능. 1시간 미만이면 0입력");
				    		int t = sc.nextInt();
				    		sc.nextLine();
				    		if(t >= 1) {
				    			int num1 = parking.contains(Character.toLowerCase(parkChar));
				    			if(num1 >= 0) {
				    				for(int i=1; i<num1; i++) {
				    					if(parking.isFull()) {
				    						System.out.println("뺄곳이 없음");
				    						continue MENU;
				    					}
				    					else {
				    						char car = parking.dequeue();
				    						parking.enqueue(car);
				    					}
				    				}
				    				parking.dequeue();
				    				System.out.println("선행차량 이동 후 출차");
				    			}
				    			else System.out.println("차량 x");
				    		}
				    		else parking.showQueue();
				    	}
			    	}
			    	else System.out.println("차량 x");
			    	break;
				case "3" :
					if(parking.isFull()) System.out.println("주차 불가");
					else System.out.println("주차 가능");
					break;
				case "4" :
					System.out.println("종료");
					System.exit(0);
					break;
				default :
					System.out.println("다시 입력");
	        }
		}
	}
}
