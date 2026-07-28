package extendsex.abstractex;

public abstract class Animal { // 추상 클래스는 일반 메서드가 들어가도 상관 x
	public void show() {
		System.out.println("동물입니다.");
	}
	// 추상 메소드 : 상속 받으면 반드시 구현되어야 함
	public abstract void sound();
}
