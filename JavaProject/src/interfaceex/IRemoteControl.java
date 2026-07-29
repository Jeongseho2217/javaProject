package interfaceex;

public interface IRemoteControl {
	// 상수 필드 선언 : 선언과 동시에 반드시 초기화
	// [public static final] 데이터타입 필드명 = 값
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드 선언 : public abstract는 생략해도 됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 선언 : 실행 블럭을 가진 메서드
	// default 키워드 필요 / 접근 제한자는 default가 아닌 public을 기본적으로 가짐
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음 처리합니다.");
		else System.out.println("무음 해제합니다.");
	};
	
	//정적 메소드 선언 : 인터페이스명을 이용해서 공용 사용
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
