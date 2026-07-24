package classInfo;

public class MainEx {

	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle();
		rec.input();
		rec.area();

		// 클래스의 접근 제한자 생략 되어 필드에 직접 접근 가능
		// rec.height = 80; private이면 직접 접근 불가

		Car c1 = new Car();
		c1.carName = "아반떼";
		c1.carNo = "111가1234";
		c1.showCarInfo();

		// rec 객체에 포함된 car 정보 메소드 해체
		rec.carInfo();
	}
}