package extendsex;

public class Child extends Parent{ // 동일 패키지 내부의 클래스 상속 - defalut/public으로 되어진 필드나 메소드를 상속받을 수 있음
	private int c;
	
	public void setChild() {
		// p = 10; - 상속 불가
		c = 20;
		p3 = 50;
	}
	
	public void showChild() {
		//상속 받은 클래스에서 super(부모)클래스 상속된 기능 사용 가능
		showParent();
		System.out.println("부모 클래스 p2 : " + p2); // default(protected)라 동일 패키지 내에 상속 가능
		System.out.println("자식 클래스 c : " + c);
	}
}
