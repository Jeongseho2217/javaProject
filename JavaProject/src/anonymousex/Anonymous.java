package anonymousex;

public class Anonymous {
	//멤버 필드 + 초기화 : Person클래스를 상속받는 익명 객체 인스턴스로 초기화
	Person field = new Person() {
		// Person을 상속받은 익명객체의 구현부
		
		// 익명 객체 일반 메서드
		void work() {
			System.out.println("출근합니다.");
		}
		
		//상속받은 메서드 재정의
		@Override
		void wake() {
			System.out.print("6시에 일어나서 ");
			work();
		}
	};
	// 로컬변수를 초기화할 때 익명 자식 객체 사용
	// 멤버메소드
	void method1() {
		//로컬변수의 값으로 익명 자식 객체 인스턴스 대입
		Person localVar = new Person() {
			void work() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.print("7시에 일어나서 ");
				this.work(); // this: 익명 객체 클래스를 의미 / Person() { } 이부분
			}
		};
		
		// 메소드 내부에서 로컬 변수 사용하여 재정의된 메소드 호출
		localVar.wake();
	}
	
	// 매개변수를 이용해서 익명 자식 객체 사용
	void method2(Person person) {
		person.wake();
	}
}
