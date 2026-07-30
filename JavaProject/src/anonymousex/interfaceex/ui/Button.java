package anonymousex.interfaceex.ui;

//내부에 멤버 인터페이스 설정 후 구현 객체는 독립 클래스로 구현
public class Button {
	
	onClickListener listener; //인터페이스 타입 참조변수, 구현 객체 가능
	
	public void setListener(onClickListener listener) { // button 객체 통해 인터페이스 구현
		this.listener = listener;
	}
	
	// 버튼 이벤트가 발생하면 호출하는 메서드
	void touch() {
		//인터페이스를 통해 구현 객체의 메소드를 호출
		listener.onClick();
	}

	//중첩인터페이스 : 클래스 내부에 구현
	interface onClickListener{
		void onClick();
	}
}
