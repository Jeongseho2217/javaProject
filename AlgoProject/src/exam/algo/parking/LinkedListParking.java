package exam.algo.parking;

import java.util.Scanner;

public class LinkedListParking {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("주차 가능 대수 : ");
		int space = sc.nextInt();
		sc.nextLine();
		System.out.println("주차 가능 대수가 " + space + "대로 설정되었습니다.");
		
		while(true) {		
			System.out.println("============메뉴============");
			System.out.println("0. 주차 여부 확인");
			System.out.println("1. 자동차 주차");
			System.out.println("2. 자동차 출차");
			System.out.println("3. 만차여부");
			System.out.println("4. 종료");
			System.out.println("===========================");
			System.out.print("메뉴 선택 > ");
			int n = sc.nextInt();
			sc.nextLine();

			switch(n) {
				case 0:
					System.out.print("주차 여부를 확인하고 싶은 차 고유 문자 입력 > ");
					String carNo = sc.nextLine();
					
					int idx = linkedList.indexOf(carNo);
					if (idx == -1) {
						System.out.println(carNo + " 차량은 현재 주차되어 있지 않습니다.");
					} else {
						System.out.println(carNo + " 차량은 현재 " + idx + "번째에 주차되어 있습니다.");
					}
					break;
				case 1:
					
					if (cnt >= space) {
						System.out.println("주차 공간이 부족하여 주차할 수 없습니다.");
						break;
					}
					
					System.out.print("주차될 차량의 고유 문자를 입력 > ");
					String carNo1 = sc.nextLine();
					
					if (cnt == 0) {
						linkedList.insertNode(carNo1);
						cnt++;
						System.out.println(carNo1 + " 차량이 첫 번째로 주차되었습니다.");
					} else {
						System.out.print("어느 차량 뒤에 주차할건지 차량 고유 문자 입력 > ");
						String targetCar = sc.nextLine();

						ListNode preNode = linkedList.searchNode(targetCar);

						if (preNode != null) {
							linkedList.insertNode(preNode, carNo1);
							cnt++;
							System.out.println(targetCar + " 차량 뒤에 " + carNo1 + " 차량이 주차되었습니다.");
						} else System.out.println(targetCar + " 차량을 찾을 수 없어 주차에 실패했습니다.");
				    }
					break;
				case 2:
					System.out.print("출차할 차량 고유 문자 입력 > ");
					String exitCar = sc.nextLine();
					
					if (linkedList.searchNode(exitCar) != null) {
						linkedList.deleteNode(exitCar);
						cnt--;
						System.out.println(exitCar + " 차량이 출차되었습니다.");
						System.out.print("현재 주차 현황: ");
						linkedList.printList();
					} else {
						System.out.println("해당 차량이 주차장에 존재하지 않습니다.");
					}
					break;
				case 3:
					if (cnt >= space) System.out.println("현재 주차된 차는 " + cnt + "대로 만차입니다.");
					else System.out.println("현재 주차된 차는 " + cnt + "대로 " + (space - cnt) + "개의 공간 여유가 있습니다.");
					break;
				case 4:
					System.out.println("프로그램 종료");
					sc.close();
					return;
			}
		}	
	}
}
