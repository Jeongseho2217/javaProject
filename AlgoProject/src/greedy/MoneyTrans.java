package greedy;

import java.util.Scanner;

public class MoneyTrans {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력: ");
		int money = sc.nextInt();
		
		int[] cnt = {5000,1000,500,100,50,10}; // 각각 5000 1000 500 100 50 10
		
		// 하나씩 출력
		for(int i=0;i<cnt.length;i++) {
			System.out.println(cnt[i] + "원: " + money/cnt[i]);
			money %= cnt[i];
		}
		
		System.out.println("나머지: " + money);
		sc.close();
	}
}
