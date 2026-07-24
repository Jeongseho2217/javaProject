package classInfo;

public class Car {
	// 클래스 구성요소 필드(속성, 변수) + 메소드(기능, 함수)
	// 필드 - 초기화 연산만 가능, 일반 연산은 불가능
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCc;

	int x=0;
	int y=0;
	//y+=x; (x)

	// 메소드 : 객체를 통해 어디서든 접근 가능(public), 반환값 없음 : void
	// 클래스에 필요한 연산이 있을 경우 메소드에서 진행
	public void showCarInfo() {
		System.out.println("차량정보");
		y+=x;; // (ㅇ)
	}
}
