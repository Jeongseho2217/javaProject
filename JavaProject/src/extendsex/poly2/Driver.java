package extendsex.poly2;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수 클래스 타입, superclass기 때문에 다형성 반영 가능
		vehicle.run();
		System.out.println("차량이 달립니다.");
	}
}
