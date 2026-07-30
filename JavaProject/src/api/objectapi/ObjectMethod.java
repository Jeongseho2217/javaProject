package api.objectapi;

public class ObjectMethod {
	public static void main(String[] args) {
		// Object.equals() : 객체 비교 메소드
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//번지 비교
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
		// Object.hashCode() : 객체의 해시코드를 반환
		// 객체의 해시코드 : 객체를 식별할 하나의 정수값
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		// Object.toString() : 객체의 문자정보 리턴(주로 하위 클래스에서 재정의해서 개발자의도에 맞게 출력을 진행하도록 함)
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		// Object.clone() : 객체 복제
		
		// Object.finalize() : 객체 소멸자, GC(가비지 콜렉터)는 객체를 소멸 시키기 직전 finalize()를 호출
		// 기본적으로 실행내용 없음, 개발자가 객체가 소멸되기 전에 실행할 코드가 있다면 Object.finalize() 재정의
		
		// System.gc(); 가비지 콜렉터 호출(메모리 정리) 단, 바로 호출되지는 않고 메모리가 부족해지거나 CPU가 한가할 때 JVM에 의해 실행됨
		// finalize() : 언제 호출될지 모름
		// 메서드는 있지만 가능하면 안 사용하는게 좋음
	
	}
}
