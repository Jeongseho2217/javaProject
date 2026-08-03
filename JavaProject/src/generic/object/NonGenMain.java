package generic.object;

public class NonGenMain {

	public static void main(String[] args) {
		// 모든 타입의 데이터를 필드에 저장하는 Box 클래스 사용 예시
		// 여러 박스의 타입이 서로 다른 상품 저장
		Box box = new Box();
		box.set("홍길동");
		
		Box box1 = new Box();
		box1.set(7); // int -> Object
		
		Box box2 = new Box();
		box2.set(3.14); // double -> Object
		
		// 각 박스에서 상품을 추출
		// 문자열 상품
		String name = (String)box.get();
		
		// 정수 상품
		int no = (int)box1.get();
		
		// 정수 상품
		double pi = (double)box2.get();
	}

}
