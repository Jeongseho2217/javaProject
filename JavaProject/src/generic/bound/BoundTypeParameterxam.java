package generic.bound;

public class BoundTypeParameterxam {

	public static void main(String[] args) {
		// 제네릭 파라미터 타입 제한
		// Util.compare("a", "b"); Number안에 들어가지 않는 문자열은 허용 불가
		
		System.out.println(Util.compare(10, 20));
		System.out.println(Util.compare(4.3, 3));
		//System.out.println(Util.compare('a','b')); //char은 Number 클래스의 자식 클래스가 아님
	}

}
