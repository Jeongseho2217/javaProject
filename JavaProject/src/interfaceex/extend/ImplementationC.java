package interfaceex.extend;

// InterfaceC는 A, B를 상속받았기 때문에
// 상/하위 추상 메소드 필수로 모두 구현해야 함
public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("CImplclass의 MethodA() 실행");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("CImplclass의 MethodB() 실행");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("CImplclass의 MethodC() 실행");
	}

}
