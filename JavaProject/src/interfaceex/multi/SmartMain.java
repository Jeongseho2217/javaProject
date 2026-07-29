package interfaceex.multi;

public class SmartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision stv = new SmartTelevision();
		
		stv.turnOn();
		stv.search(null);
		stv.turnOff();
		
		// 다중 인터페이스 다형성은 거의 사용되지 않는다.
		// IRemoteControl rc = new SmartTelevision();
		// ISearchable sc = new SmartTelevision(); // 본인이 가지는 Search만 쓸 수 있음
	}

}
