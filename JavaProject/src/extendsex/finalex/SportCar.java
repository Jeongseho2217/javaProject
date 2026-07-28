package extendsex.finalex;

public class SportCar extends MyCar{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop() {  //Cannot override the final method from MyCar
//	} // 파이널된 메소드는 오버라이딩 불가 클래스는 상속 불가 상수는 값 변경 불가
}
