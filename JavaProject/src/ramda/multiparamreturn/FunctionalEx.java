package ramda.multiparamreturn;

public class FunctionalEx {

	public static void main(String[] args) {
		// 함수형 인터페이스 구현 객체 구성(람다식)
		MyFunctionalInterface fi;
		
		// 매개변수 2개, 반환값 있는 람다식, 실행문자 2문장 이상일 경우
		fi = (int x, int y) -> {
			System.out.println(x * y + " - 반환");
			return x * y;
		};
		
		fi.method(1, 3);
		
		fi = (x, y) -> x * y; // 리턴값이 1문장이면 중괄호, 리턴 모두 생략 가능
		
		// fi = x, y -> x * y; // x 매개변수가 두개 이상이면 소괄호 생략 불가
	}

}
