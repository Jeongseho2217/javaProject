package exam;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* 상품 정보 *******");
		System.out.println("1 노트북 : 1,200,000 원");
		System.out.println("2 디지털카메라 : 400,000 원");
		System.out.println("**********************");
		System.out.print("상품번호 입력 : ");
		int num = sc.nextInt();
		
		if (!(num == 1 || num == 2)) {
			System.out.println("잘못 입력하였습니다. 종료합니다.");
			sc.close();
			return;
		}
		
		System.out.print("주문 수량 입력 : ");
		int amount = sc.nextInt();
		System.out.println("******* 주문 내용 *******");
		
		switch(num) {
		case 1: {
			int nPrice = 1200000 * amount;
			System.out.println("상품명 : 노트북");
			System.out.println("가격" + 1200000 + " 원");
			System.out.println("주문 수량 : " + amount  + " 개");
			System.out.println("주문액 : " + nPrice + " 원");
			if (1000000 <= nPrice) System.out.println("할인액 : " + (int)(nPrice * 0.1) + " 원"); // 노트북은 백만원 이상이므로 이것만 구현	
			System.out.println("총 지불액 : " + (nPrice -= nPrice * 0.1) + " 원");
		}
		case 2: {
			int dPrice = 400000 * amount;
			double DiscountMult;
			System.out.println("상품명 : 디지털 카메라");
			System.out.println("가격" + 400000 + " 원");
			System.out.println("주문 수량 : " + amount + " 개");
			System.out.println("주문액 : " + dPrice + " 원");
			if (1000000 <= dPrice) {
				DiscountMult = 0.1;
				System.out.println("할인액 : " + (int)(dPrice * DiscountMult) + " 원");
				System.out.println("총 지불액 : " + (dPrice -= dPrice * DiscountMult) + " 원");
			} else if (500000 <= dPrice) {
				DiscountMult = 0.05;
				System.out.println("할인액 : " + (int)(dPrice * DiscountMult) + " 원");
				System.out.println("총 지불액 : " + (dPrice -= dPrice * DiscountMult) + " 원");
			} else {
				System.out.println("할인액 : " + 0 + " 원");
				System.out.println("총 지불액 : " + dPrice + " 원");
			}
		}
		}
		
		
		sc.close();
		
	}

}
