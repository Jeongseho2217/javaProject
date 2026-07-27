package extendsex;

class SuperClass {
	int x;
	int y;
	public SuperClass() {
		x = 5;
		y = 10;
	}
}
// SuperClass의 필드가 default이므로 동일패키지 클래스인 sub에서는 필드 모두 사용 가능(상속)
class SubClass extends SuperClass{
	int x;
	
	public SubClass() {
		x = 10;
	}
	
	public void show() {
		System.out.println(x); // Sub와 Super에 둘다 x가 있으면 자식 걸 먼저 씀
		System.out.println(y); // Sub에 없고 Super에 있기 때문에 Super걸 가져와 씀
		System.out.println("Super의 x : " + super.x); // 굳이 중복된 부모 클래스의 값을 쓰고 싶으면 명시적으로 super에서 가져오겠다 표현해줘야 함
		System.out.println("Sub의 x : " + this.x); // (== x) 자식 클래스의 값을 명시적으로 표기하고 싶으면 this로 가져오겠다 표현하면 된다.
		System.out.println("Super의 y : " + this.y); // == y
	}
}

public class SuperEx {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.show();
	}
}
