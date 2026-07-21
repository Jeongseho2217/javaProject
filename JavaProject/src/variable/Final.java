package variable;

public class Final {

	public static void main(String[] args) {
		
		final double PI = 3.14; // 상수, const 같은거
		

		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		
		radius = 20.0; // 변경 가능
		//PI = 20; 변경 불가
		// 문자열로 변경되어 파라미터로 전달
		System.out.println("원의 면적 = " + circleArea);
	}
}
