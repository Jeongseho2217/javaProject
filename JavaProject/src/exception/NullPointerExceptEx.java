package exception;

public class NullPointerExceptEx {
	public static void main(String[] args) {
		// 실행 예외 : 객체 참조
		String data = null;
		System.out.println(data.toString()); // NullPointerException / null값을 참조하려 함
		
	}
}
