package extendsex;

class Parent1 {
	
}

class Child1 extends Parent1{
	
}

public class InstanceOf {

	public static void main(String[] args) {
		// 객체 타입 확인 예시
		Parent1 p1 = new Parent1();
		System.out.println(p1 instanceof Parent1); //true
		System.out.println(p1 instanceof Child1); // false
		
		Child1 c = new Child1();
		System.out.println(c instanceof Parent1); // true 자동형변환이 가능한 관계이므로 true 반환
		System.out.println(c instanceof Child1); // true
		
		Parent1 pc = new Child1(); // pc -> Child1 주소값은 그대로
		System.out.println(pc instanceof Parent1); // true / 부모타입으로 형변환 되어 참조가 저장됨
		System.out.println(pc instanceof Child1); // true 
		
		Child1 c2 = (Child1)pc; // 강제 형변환 가능
		
		// Child1 c3 = (Child1)p1; // 문법적인 오류는 없지만 (p1 instanceof Child1)에서 false를 반환하므로 런타임에러가 발생
		// 강제 형변환 전에 instanceof로 false가 나오는지 확인을 해줘야함.
	}

}
