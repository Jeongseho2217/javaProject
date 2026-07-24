package classInfo;

public class CarMain {

	public static void main(String[] args) {
	//프로그램의 실행과 종료	
	// 클래스는 사용자 정의 타입 - 클래스 타입의 변수(참조 변수) 선언 가능
	// 설계도인 클래스를 이용해서 객체 인스턴스를 생성하면 생성할 때마다 독립적인 인스터스가 생기며 시작 주소를 반환
	// 반환된 주소를 클래스타입 변수에 저장해야 인스턴스를 쓸 수 있음
	// 아무도 저장하고 있지 않으면 사용되지 않는 가비지 인스턴스
	Car c1 = new Car(); //생성자 함수 호출하고 메모리 할당(heap 영역)받아
	Car c2 = new Car(); // 새로운 변수 5개 + 메소드 1개 공간을 할당받고 공간의 시작 주소를 반환
	Car c3 = new Car();
	//c1 = c2; // c1이 참조하던 인스턴스가 삭제되어 버리고 c2의 인스턴스를 참조 c1이 원래 참조한 인스턴스는 더 이상 쓰이지 않음(가비지 인스턴스)

	// 참조변수 활용하여 인스턴스 필드, 메소드 사용
	c1.carNo = "11가 1234";
	c2.carNo = "22나 5678";
	c3.carNo = "34가 1111";

	c1.carName = "아반떼";
	c3.carMaker = "현대";

	c1.showCarInfo();
	c3.showCarInfo(); // 객체 인스턴스는 독립적

	System.out.println(c1.carName);
	System.out.println(c3.carMaker);
	
	int x=0;
	int y=0;
	y+=x;

	// 객체 인스턴스 삭제 >> 참조 주소를 삭제
	c1 = null;
	}
}
