package interfaceex;

public class Iphone implements ISmartPhone{

	String name;
	
	public Iphone() {
		name = "아이폰";
	}
	
	@Override
	public void sendCall() {
		System.out.println(name + "으로 전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		SamsungPhone sp = new SamsungPhone();
		
		System.out.println(sp.name + "이 전화를 걸어옵니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
	
}
