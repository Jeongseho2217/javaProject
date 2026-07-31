package exception.classcast;

public class Parent {
	private int p; // 얘만 상속되지 않음
	int p2;
	public int p3;
	
	public void setParent() { // 얘랑
		p = 10;
		p2 = 20;
	}
	
	void showParent() { // 얘는 상속이 됨
		System.out.println("부모 클래스 p : " + p);
	}
}
