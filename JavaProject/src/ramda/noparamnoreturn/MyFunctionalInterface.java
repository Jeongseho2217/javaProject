package ramda.noparamnoreturn;

@FunctionalInterface // 추상 메소드가 무조건 1개만 있는 인터페이스
public interface MyFunctionalInterface {
	public void method();
	// public void method2(); // 추가 불가
}
