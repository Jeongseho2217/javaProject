package totalexam;

import java.util.Scanner;

public class StorageMain {

	public static void main(String[] args) {
		BinarySearchTreeStorage<Product> storage = new BinarySearchTreeStorage<Product>();
		Scanner sc = new Scanner(System.in);
		
		storage.add(new Product("melon", 5));
		storage.add(new Product("apple", 5));
		storage.add(new Product("banana", 5));
		storage.add(new Product("melon", 5));
		storage.add(new Product("orange", 5));
		storage.add(new Product("kiwi", 5));
		storage.add(new Product("mango", 5));
		storage.add(new Product("tomato", 5));
		
		while(true) {
			System.out.println("==========메뉴==========");
			System.out.println("=====1. 새 품목 등록=====");
			System.out.println("====2. 재고 품목 반출====");
			System.out.println("=====3. 프로그램 종료=====");
			System.out.print("메뉴 선택 > ");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					System.out.print("재고 등록 : ");
					String pName = sc.next();
				    int pStock = sc.nextInt();
				    sc.nextLine();
					storage.add(new Product(pName, pStock)); // 품목 추가
					System.out.print("재고 등록 결과 : ");
					storage.preorder();
					System.out.println();
					break;
				case 2:
					System.out.print("재고 확인 : ");
				    storage.preorder();
				    System.out.println();
				    
					System.out.print("재고 반출 : ");
					String pNameDel = sc.next();
				    int pStockDel = sc.nextInt();
				    sc.nextLine();
					int resTemp = storage.updateStock(new Product(pNameDel), pStockDel);
					
					if(resTemp == 0) {
						System.out.println("재고가 없는 품목이므로 재고 품목에서 삭제합니다.");
						storage.remove(new Product(pNameDel));
					}
					else if(resTemp == -1) System.out.println("반출 수량만큼 재고가 없습니다.");
					else if(resTemp == 1) {
						System.out.println("재고 반출 완료");
					}
					else System.out.println("반출하려는 품목이 창고에 없습니다.");
					
					System.out.print("재고 확인 : ");
				    storage.preorder();
				    System.out.println();
				    
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
			}
		}
	}
}
