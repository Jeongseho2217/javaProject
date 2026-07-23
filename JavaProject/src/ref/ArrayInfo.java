package ref;

import java.util.Arrays;

public class ArrayInfo {

	public static void main(String[] args) {
		// 배열 참조 변수 선언 방법
		// 1. dataType[] varName
		int[] a;
		// 2. dataType varName[]
		double a1[];
		
		String[] name; // name 배열 변수가 참조하는 주소에 가면 문자열이 저장된 주소값이 나열되어 있음.
		
		// 배열 선언 후 new로 메모리 할당을 받아야 함
		// new arrayDataType[Length]
		// 배열 선언과 동시에 할당
		int z[] = new int[3];
		
		a1 = new double[5]; // 같은 논리로 미리 선언된 변수도 가능
		
		// int[3] d; int e[3]; <-- 선언과 동시에 크기 지정은 불가능
		// 배열 선언 후 메모리 할당 받으면 자료형의 기본값으로 초기화 됨
		
		int ab[] = new int[5]; // int byte short 초기값 0 long은 0L
		boolean b[] =  new boolean[3]; // 초기값 false
		double d[] = new double[5]; // 초기값 0.0
		String s[] = new String[5]; // 초기값 null
		char[] c = new char[5]; // 초기값 \u0000 (유니코드의 null값)
		
		// 배열 선언 후 바로 값 대입도 가능
		int n1[] = {1,2,3,4,5};
		double n2[] = {5.0,6.5};
		String[] nation = {"Kor", "Jpn", "Cn"};
		
		// 주의사항
		int n3[]; // 배열 선언 후
		//n3 = {1,2,3,4,5}; // 실제값 대입은 오류 발생 (두번 초기화하는 걸로 인식)
		n3 = new int[] {1,2,3,4,5}; // 어떻게 초기화 할건지는 정할 수 있음
		// ab = {1,2,3,4,5}; // 이미 초기화됨
		System.out.println(n1); // [I@1f32e575 -> 가상 메모리 주소(16진수)
		// 가상주소가 [ 시작하면 배열, [ : 1차원 [[ : 2차원
		
		// 배열 사용 : 배열 원소에 값 저장 또는 값 참조(원소의 값 복사 후 반환)
		// 원소 접근 index 사용(0부터 시작)
		int x = n3[0]; // n3의 주소에 가서 0번 인덱스의 값을 복사해서 반환하세요
		System.out.println(x);
		n3[0] = 3; // 참조 저장
		System.out.println(n3[0]);
		
		// 배열은 객체의 특수한 형태, 배열의 정보 속성을 사용가능
		// Length 같은거
		System.out.println(n3.length);
		System.out.println("--------------");
		// 반복문으로 활용하여 모든 원소에 접근 가능
		for(int i=0; i<n3.length; i++) {
			System.out.println(n3[i]);
		}
		
		// length는 필드이기 때문에 직접 변경 불가능
		// n3.length = 10; x
		
		//배열 길이는 변경 불가하니 다른 큰 배열 생성하여 복사하는 방식을 해야함
		
		//참조형 배열 예시
		String[] flowers = {"해바라기", "장미", "진달래"};
		for(int i=0; i<flowers.length; i++) {
			System.out.print(flowers[i] + " ");
		}
		
		System.out.println();
		
		// 배열 변수 출력 : 배열의 가상주소
		// 배열 변수 toString() 활용 - 문자열 변환(참조형 객체인 경우에는 참조하는 데이터를 문자열로 반환)
		// 배열 전체의 원소 내용을 확인하려면 toString이 효율적
		System.out.println(Arrays.toString(flowers));
		System.out.println(Arrays.toString(n3));
		
		//배열 크기 확인
		System.out.print(flowers.length);
		
		int[] score1 = new int[] {};
		int[] score2 = {};
		int[] score3 = new int[0];
		System.out.println(score1.length);
		System.out.println(score2.length);
		System.out.println(score3.length);
	}
}
