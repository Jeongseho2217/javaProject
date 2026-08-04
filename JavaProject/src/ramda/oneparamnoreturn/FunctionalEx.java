package ramda.oneparamnoreturn;

public class FunctionalEx {

	public static void main(String[] args) {
		// 함수형 인터페이스 구현 객체 구성(람다식)
		MyFunctionalInterface fi;
		
		// 매개변수 1개, 반환값 없는 람다식, 실행문자 2문장 이상일 경우
		fi = (int x) -> {
			int res = x * 5;
			System.out.println(res);
		};
		
		fi.method(1);
		
		// 매개변수 1개, 반환값 없는 람다식, 매개변수가 1개일 경우 괄호 생략 가능
		fi = x -> {
			int res = x * 5;
			System.out.println(res);
		};
		
		fi.method(3);
		
		// 매개변수 1개, 반환값 없는 람다식, 문장, 매개변수가 1개일 경우 양쪽 중/소괄호 생략 가능
		fi = x -> System.out.println(x * 5);
		
		fi.method(5);
	}

}
