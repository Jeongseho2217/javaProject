package generic.method;

public class BoxingMethodExam {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100); // box1은 boxing 메소드에 의해 box 객체 반환
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String stringValue = box2.get();
		System.out.println(stringValue);
	}
}
