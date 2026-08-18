package datastructure.collection.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStore {
	Scanner scan = new Scanner(System.in);
	
	//메뉴를 출력하고 실행할 번호 입력을 반환하는 메서드
	public int displayMenu() {
		System.out.println("======================");
		System.out.println("==== lotto 프로그램 ====");
		System.out.println("======================");
		System.out.println("1. lotto 구입 2. 프로그램 종료");
		System.out.println("======================");
		System.out.print("메뉴 선택 : ");
		int n = scan.nextInt();
		return n;
	}
	
	public void lottoStoreStart() {
		while(true) {
			int choice = displayMenu();
			switch(choice) {
			case 1 : // lotto 구입
				buyLotto();
				break;
			case 2 :
				System.out.println();
				System.out.println("종료");
				return;
			default :
				System.out.println("메뉴를 다시 선택하세요. 번호가 없습니다.");
				break;
			}
		}
	}
	
	public void buyLotto() {
		System.out.println();
		System.out.println("lotto 구입 시작");
		System.out.println();
		System.out.println("lotto 한장 1000원");
		System.out.print("금액 입력 : ");
		int money = scan.nextInt();
		
		if(money < 1000) {
			System.out.println("금액이 모자랍니다. 로또 구입 실패");
			return;
		}else if(money >= 1001000) {
			System.out.println("입력 금액이 너무 많습니다. 로또 구입 실패");
			return;
		}
		
		getLotto(money); // 로또 생성 메서드
		
		System.out.println("받은 금엑은 " + money + "원이고, 거스름 돈은" + (money % 1000));
	}
	
	public void getLotto(int money) {
		Set<Integer> lottoSet = new HashSet<>();
		
		int num = money /1000; // lotto 구매 개수
		
		System.out.println();
		System.out.println("로또는 아래와 같습니다.");
		
		for(int i=1; i<=num; i++) { // lotto 장수
			while(lottoSet.size() < 6) {
				lottoSet.add((int)(Math.random()*45 + 1));
			}
			ArrayList<Integer> lottolist = new ArrayList<>(lottoSet); //ArrayList 생성자에는 ArrayList로 변환가능한 객체 전달하면
			Collections.sort(lottolist);
			System.out.println("로또번호 " + i + ":" + lottolist);
			lottoSet.clear();
		}
	}

	public static void main(String[] args) {
		new LottoStore().lottoStoreStart();
	}
}
