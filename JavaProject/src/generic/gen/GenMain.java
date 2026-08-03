package generic.gen;

public class GenMain {

	public static void main(String[] args) {
		// 모든 타입의 데이터를 필드에 저장하는 Box 클래스 사용 예시
		// 여러 박스의 타입이 서로 다른 상품 저장
		Box<String> box = new Box<String>(); // 제네릭 타입ㅇ T가 String으로 구체화 됨
		box.set("홍길동");
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(7);
		
		Box<Double> box2 = new Box<Double>();
		box2.set(3.14);
		
		// 각 박스에서 상품을 추출
		// 문자열 상품
		String name = box.get();
		
		// 정수 상품
		int no = box1.get();
		
		// 정수 상품
		double pi = box2.get();
	}

}
