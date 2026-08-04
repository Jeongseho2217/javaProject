package ramda.noparamnoreturn;

public class FunctionalEx {

	public static void main(String[] args) {
		// 함수형 인터페이스 구현 객체 구성(람다식)
		MyFunctionalInterface fi;
		
		// 매개변수, 반환값 없는 람다식(빈괄호 필수), 실행문자 2문장 이상일 경우
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		// 매개변수, 반환값 없는 람다식(빈괄호 필수), 실행문자 1문장일 경우(중괄호 생략 가능)
		fi = () -> System.out.println("method call2");
		
		fi.method();
	}

}
