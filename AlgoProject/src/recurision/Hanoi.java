package recurision;

import java.util.Scanner;

public class Hanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		int n = sc.nextInt();

		hanoi("'좌측 기둥'", "'중앙 기둥'", "'우측 기둥'", n);
	}
	
	static void hanoi(String from, String m, String to, int n) {
		System.out.printf("f:%s m:%s t:%s\n", from, m, to);
		if(n == 0) return;
		
		hanoi(from, to, m, n-1);
		System.out.printf("원반 [%d]을 %s에서 %s로 옮겼습니다.\n", n, from, to);
		hanoi(m, from, to, n-1);
	}
}
