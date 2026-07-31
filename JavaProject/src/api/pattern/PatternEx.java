package api.pattern;

import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String[] args) {
		String data = "010-123-1234";
		// 전화번호는 02또는 010 으로 시작하고 구분자 - 가 있고 가운데 번호(숫자)는 3자리 또는 4자리가 올 수 있고 마지막은 4자리 고정
		// 마지막 번호는 4자리
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // 정규식 패턴 지정
		//Pattern 클래스 static 메서드 Pattern.matches(정규 표현식, 매칭할 데이터)
		//true/false 반환
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 이메일 확인
		// 영문 or 숫자(한 문자 이상)@영문(한 문자 이상).
		// 이메일은 .이 두번 나올 수 있다.
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 정규식 패턴 지정 / ()? 기호는 ()안의 내용이 0번이거나 1번이거나
		data = "angel@navercom";
		data = "angel@naver.co.kr";
		data = "angel@naver.co.kr.a"; 
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
