package extendsex.access;

public class AAA {
	public int field1;
	int field2;
	private int field3;
	protected int field4;
	
	public AAA() {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		field4 = 4;
		
		method1();
		method2();
		method3(); // 동일 클래스 내부엔 메소드며 멤버며 접근 제한이 없음
		
	}
	
	public void method1() {
	}
	void method2() {
		
	}
	private void method3() {
		
	}
}
