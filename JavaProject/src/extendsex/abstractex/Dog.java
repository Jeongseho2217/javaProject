package extendsex.abstractex;

public class Dog extends Animal{
	
	@Override // 일반 메소드이므로 재정의는 선택 사항
	public void show() {
		System.out.println("강아지 입니다.");
	}
	
	@Override // Animal의 추상 메소드 미구현 부분을 여기서 반드시 구현
	public void sound() {
		System.out.println("멍멍");
	}
}
