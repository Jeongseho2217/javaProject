package api.wrapper;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// Boxing : 기본 타입 -> Wrapper 타입
		// 생성자
		Integer obj1 = new Integer(100);
		Integer obj2 = Integer.valueOf(200);
		Integer obj3 = Integer.valueOf("300"); // 문자열로도 가능
		
		// 자동 Boxing
		Integer obj4 = 400;
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		// 자동 언박싱
		int value4 = obj4;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
