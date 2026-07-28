package exam.instarray;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cName, job, callNum, sex;
		int cNo, age;
		
		Customer[] g = new Customer[3];
		
		System.out.println("**** 고객 정보 입력 ****");
		for(int i = 0; i < g.length; i++) {
			System.out.print("\n고객번호 : ");
			cNo = sc.nextInt();
			System.out.print("고객명 : ");
			cName = sc.next();
			System.out.print("전화번호 : ");
			callNum = sc.next();
			System.out.print("직업 : ");
			job = sc.next();
			System.out.print("성별 : ");
			sex = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			// 객체 생성 시 생성자 호출되면서 인수값 전달
			g[i] = new Customer(cNo, cName, callNum, job, sex, age);
		}
		System.out.println("**** 고객 정보 출력 ****");
		for(int i = 0; i < g.length; i++) {
			// 객체 생성 시 생성자 호출되면서 인수값 전달
			g[i].showCustomerInfo();
		}
	}

}
