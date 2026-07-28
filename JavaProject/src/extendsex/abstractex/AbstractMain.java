package extendsex.abstractex;

public class AbstractMain {
	public static void main(String[] args) {
		// 추상클래스 활용 예시
		// 추상클래스는 독립적인 객체 인스턴스 생성 불가능
		// Animal ani = new Animal();
		
		Dog dd = new Dog(); // 추상 클래스를 상속받는 자식 인스턴스는 생성 가능
		Cat cc = new Cat();
		
		dd.show(); // 재정의된 메서드 호출
		dd.sound(); // 구현된 추상 메서드가 구현된 메서드 호출
		
		// 추상 클래스는 단독 개체 생성은 불가능하지만 서브 클래스 생성 시 같이 생성됨
		cc.show(); // Cat 클래스에서는 재정의하지 않았으므로 Animal의 show를 호출
		cc.sound();
		
		// 추상 클래스 참조변수에 서브 클래스 인스턴스 대입이 가능할까? 추상클래스 다형성을 사용할 수 있음
		Animal ani = new Cat();
		ani.show();
		ani.sound();
		
		ani = new Dog();
		ani.show();
		ani.sound();
		
		//강제 형변환 가능?
		if (ani instanceof Dog) {
			Dog dd1 = (Dog)ani; // 가능
			System.out.println("Animal 추상 클래스 참조 변수 강제 형변환");
		}
	}
}
