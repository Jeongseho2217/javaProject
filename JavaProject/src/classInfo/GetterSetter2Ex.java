package classInfo;

public class GetterSetter2Ex {

	public static void main(String[] args) {
		GetterSetter2 myCar = new GetterSetter2(); // 기본 생성자 호출(컴파일러 추가)
		
		// 잘못된 속도 변경
		//setter 사용
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//setter 사용
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 멈춤 신호가 true가 아닐 경우
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
