package ramda.localvar;

// 메서드 내부에서 함수형 인터페이스 참조변수 사용 예시
public class UsingThis {
	public int outterField = 10;
	int field = 100;
	
	class Inner {
		int innerField = 20;
		int field = 200;
		
		void method(int arg) {
			//로컬변수
			int localVar = 40;
			int localVar2;
			localVar2= 60;
			
			//localVar2 += 20; // final 수정 금지 람다식에선 사용 뷸가
			
			//로컬변수 람다식 구현시 final 특성 제약사항
			MyFunctionalInterface fi = () -> {
				//로컬변수 사용
				System.out.println("arg : " + arg);
				System.out.println("localVar : " + localVar);
				System.out.println("localVar : " + localVar2);
				
				// 바깥 중첩 클래스 필드의 이름이 다를 경우 바로 접근
				System.out.println("outterField : " + outterField);
				System.out.println("innerField : " + innerField);
				
				// 바깥 중첩 클래스 필드의 이름이 같을 경우
				System.out.println("outter : " + field);
				System.out.println("inner : " + field);
			
				// 바깥 중첩 클래스 필드의 이름이 같을 경우 this 이용
				// outter 접근 -> 바깥클래스명.this. ~
				System.out.println("outter : " + UsingThis.this.field);
				System.out.println("inner : " + this.field);
			};
			fi.method();
		}
	}
}
