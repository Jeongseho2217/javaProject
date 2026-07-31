package api.arrays;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		// Arrays.sort(배열) : 항목 오름차순 정렬 메소드, 반환값 없음, 배열 항목을 실제 이동해서 정렬
		// 배열 타입이 기본타입이거나 String 배열인 경우 사용가능
		String[] strAr = {"해바라기", "가방", "나비"};
		// String[] strAr1 = Arrays.sort(strAr); - 반환값 없음
		Arrays.sort(strAr); // 오름차순으로 정렬 - 문자열의 경우 첫문자로 비교 첫 문자가 동일하면 두번째 ..
		
		for(String str : strAr) {
			System.out.println(str); 
		}
		
		//사용자 정의 클래스 배열은 Comparable 인터세이스를 구현해야만 정렬 가능
	}

}
