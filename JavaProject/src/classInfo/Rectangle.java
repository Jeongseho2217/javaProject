package classInfo;
import java.util.Scanner;

public class Rectangle {
	// 멤버 필드 초기화	
	private int width=0;
	private int height=0;
	//Scanner sc = new Scanner(System.in); // 1번 동일패키지 내에서 모두 접근 가능

	//멤버 메소드
	//데이터 입력
	public void input() {
		
	Scanner sc = new Scanner(System.in); // 2번 메소드를 불러와야 쓸 수 있음 주로 여기에 생성
	
	System.out.print("가로 길이 입력 : ");
	width = sc.nextInt();
	
	System.out.print("세로 길이 입력 : ");
	height = sc.nextInt();
	sc.close(); // 안 닫으면 충돌 일어남
	}

	public void area() {
		System.out.println("사각형 면적" + (width * height));
	}

	public void carInfo() {
		Car c2 = new Car();
		c2.carNo = "222라5678";
		c2.showCarInfo();
	}
}