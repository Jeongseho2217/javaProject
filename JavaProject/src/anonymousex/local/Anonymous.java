package anonymousex.local;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		// 로컬 변수
		final int var1 = 0;
		int var2 = 0;
		
		// 맴버 필드는 수정 되어도 상관 x 사용가능함
		field = 10;
		
		var2 = 20; // 얘는 수정되면 final이 안붙고 더이상 로컬 익명 객체에서 사용 불가함.
		
		// 익명 객체 참조하는 변수
		ICalculatable calc = new ICalculatable() {
			// 익명 객체 내에서 로컬변수/매개변수 사용예시
			@Override
			public int sum() {
				// 익명 객체가 클래스 메소드 내부에 있음(로컬 익명 객체)
				// 로컬/매개 변수 사용 할 수 있지만 해당 변수가 final이어야 함
				// 명시적으로 final을 안붙여도 수정되지 않았다면 컴파일러가 자동으로 붙여줌
				int result = field + arg1 + arg2 + var1 + var2; // 수정하지 않는 로컬/매개 변수만 사용 (final)
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
