package exception.throwex;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {} // 기본 생성자
	// 예외 처리 클래스 생성 시 예외 발생 원인(메시지)를 전달하기 위해 String 타입의 매개변수를 갖는 생성자를 구현
	public BalanceInsufficientException(String message) {// message에 예외 원인 전달
		super(message);
	}
}
// 예외 처리 클래스도 일반 클래스라 필드 메소드 생성자 만들 수 있음. 단, 원래부터 예외처리 목적으로 만들어지기
// 때문에 굳이 생성자만 오버로딩하고 다른걸 만들 필요가 없음
// 예외 메세지의 용도는 catch에서 처리할 때 사용하기 위함임
