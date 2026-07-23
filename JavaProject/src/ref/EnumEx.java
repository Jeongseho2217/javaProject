package ref;

public class EnumEx {

	public static void main(String[] args) {
		// 열거 타입 사용
		// 열거형도 타입이므로 변수를 선언하고 사용
		// 열거형은 참조타입이므로 null로 초기화 가능
		Week today = null;
		today = Week.SUNDAY;
		
		Week week1 = Week.SUNDAY;
		
		System.out.println(today == week1);
		
	}
}
