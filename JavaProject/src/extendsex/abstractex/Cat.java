package extendsex.abstractex;

public class Cat extends Animal{
	@Override // Animal의 미구현 부분을 여기서 반드시 구현
	public void sound() {
		System.out.println("야옹");
	}
}
