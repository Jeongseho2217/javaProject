package ref;

public class StringEquals {

	public static void main(String[] args) {
		// String 클래스 참조변수 선언 및 인스턴스 생성 방법 1
		// '문자열' 대입
		// String 클래스는 문자 상관없이 저장되는 변수가 1개가 있음 저장 문자열이 동일하면 기존 객체를 사용
		String strVar1="신민수";
		String strVar2="신민수";
		

		if(strVar1 == strVar2) {
			System.out.println("str1과 str2는 참조가 같다");
		} else {
			System.out.println("참조가 다르다");
		}
		
		// 참조되는 데이터가 같은지 확인하기 위해선 class가 제공하는 equals 사용
		if(strVar1.equals(strVar2)) {
			System.out.println("str1과 str2는 문자열과 같다");
		}
		String strVar3= new String("신민수");
		String strVar4= new String("신민수");
		
		if(strVar3==strVar4) {
			System.out.println("str3과 str4는 참조가 같음");
		} else {
			System.out.println("str3과 str4는 참조가 다름");
		}
	}

}
