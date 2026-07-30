package nestedclass.access.local;

public class Outter2 {
	public void method2(final int arg1, int arg2) { // 매개변수

		final int localVariable1 = 1; // 로컬 변수
		
		arg2 = 200; // 변경하면 final 값이 아니라고 판단
		
		class Inner{ //로컬 클래스
			public void method() {
				//처리 진행 시 매개변수나 로컬변수 사용시 final 인것만 사용하자
				int result = arg1 + localVariable1/* + arg2*/; // arg2는 final 값이 아니므로 사용 불가
			}
		}
	}
}
