package interfaceex;

// interface 이름은 관례적으로 대문자 I + 이름의 첫 글자는 대문자
public interface ISmartPhone {
	// 구현 클래스에서 필수 구현해야하는 메소드의 원형(선언부)을 나열
	// 생성자는 포함할 수 없음 - 인터페이스는 객체 인스턴스에 생성 불가
	public void sendCall();
	public void receiveCall();
	public void sendSMS();
	public void receiveSMS();
}
