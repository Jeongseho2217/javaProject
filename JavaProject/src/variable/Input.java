package variable;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 현재 사용중인 기본 입력 장치를 통해 입력된 값을 전달 받을 수 있음
		
		int n1, n2;
		
		System.out.print("첫번쨰 숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.println("두번쨰 숫자 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println("입력한 숫자 : " + n1 + ", " + n2);
		
		sc.close();
	}
}
