package exception.throwex;

public class Throws {

	public static void main(String[] args) {
		// main에서 떠넘겨진 메소드 사용하려는 경우 try-catch안에서 예외처리 진행

		try {
			findclass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다!");
		}
		
		
	}
	
	public static void findclass() throws ClassNotFoundException{
		// Class.forName()은 메소드 원형에서 예외를 떠 넘기고 있음
		// 해당 메소드 호출 시 try - catch로 호출하거나 호출 메서드가 throws를 진행해야함.
		Class clazz = Class.forName("java.lang.String2");
	}
}
