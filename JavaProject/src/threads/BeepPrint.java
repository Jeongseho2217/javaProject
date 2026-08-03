package threads;

import java.awt.Toolkit; // 시스템의 자원 정보(화면크기나 클립보드, 소리재생등)를 다루는 API
// awt == 자바 GUI를 위한 API에 해당

public class BeepPrint {

	public static void main(String[] args) {
		// 자바 프로그램에서 무조건 생성되는 스레드 : main
		// 기능을 추가 : main에 포함이 되도록
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 현재 시스템의 기본 설정된 자원을 반환
		
		// 비프음을 다섯번 출력하는 코드
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
		//띵 문자를 5번 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
