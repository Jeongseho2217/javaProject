package extendsex2;

public class Child2 extends extendsex.Parent{
	private int c;
	
	public void setChild() {
		// p = 10; - 상속 불가
		c = 20;
		p3 = 50;
	}
	
	public void showChild() {
		//상속 받은 클래스에서 super(부모)클래스 상속된 기능 사용 가능
		// showParent(); // default(protected)라 동일 패키지에만 상속 가능
		System.out.println("부모 클래스 p2 : "/* + p2*/); // default(protected)라 동일 패키지에만 상속 가능
		System.out.println("자식 클래스 c : " + c);
	}
}
