package interfaceex.extend1;

public class DefaultMethodExtendsEx {

	public static void main(String[] args) {
		// 익명 구현객체 사용 - 1회성 클래스
		// ChildInterface1를 익명 객체로 구현
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("c1-m1()");
			}

			@Override
			public void method3() {
				System.out.println("c1-m3()");
			}
			
		}; //이런걸 익명 구현 객체라고 함
		
		ci1.method1();
		ci1.method2(); // default 메소드
		ci1.method3();
		
		// ChildInterface2(디폴트 메소드 재정의)를 익명 객체로 구현
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("c2-m1()");
			}

			@Override
			public void method3() {
				System.out.println("c2-m3()");
			}
		};
		
		ci2.method1();
		ci2.method2(); //ChildInterface2의 재정의된 default 메소드
		ci2.method3();
		
		// ChildInterface3(디폴트 메소드를 추상 메소드로 재선언)를 익명 객체로 구현
				ChildInterface3 ci3 = new ChildInterface3() {

					@Override
					public void method1() {
						System.out.println("c3-m1()");
					}
					
					@Override
					public void method2() { // 부모에선 default지만 상속받아 추상 메소드로 재선언 했으므로 필수로 구현 해줘야 함
						System.out.println("c3-m2()");
					}

					@Override
					public void method3() {
						System.out.println("c3-m3()");
					}
				};
				
				ci3.method1();
				ci3.method2(); //ChildInterface3의 재정의된 default 메소드
				ci3.method3();
	}

}
