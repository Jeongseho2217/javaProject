package classinfo;

public class Car {
	//클래스 구성 요소 필드(속성, 변수) + 메소드(기능, 함수)
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCC;
	
	public void showCarInfo() { // 메소드 :객체를 통해 어디서든 접근 가능 (public) 반환값 없음 void
		System.out.println("차량번호 : " + carNo);
	}
}
