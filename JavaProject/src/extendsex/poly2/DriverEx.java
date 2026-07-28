package extendsex.poly2;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // superclass로 형변환
		driver.drive(taxi);
	}
}
