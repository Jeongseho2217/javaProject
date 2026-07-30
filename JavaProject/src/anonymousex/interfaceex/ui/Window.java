package anonymousex.interfaceex.ui;

public class Window {
	//멤버 필드
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	// 멤버 필드(인터페이스 타입) 초기화할때 익명 구현 객체 사용
	Button.onClickListener listener = new Button.onClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	// 생성자 함수
	Window() {
		//미리 생성한 필드를 파라미터로 전달
		btn1.setListener(listener);
		// 익명 구현 객체 생성 -> 파라미터로 객체 전달
		btn2.setListener(new Button.onClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
