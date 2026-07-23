package ref;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		// (1) 얕은 복사
		int a[] = {1,2,3,4};
		int b[] = a; // a참조변수에 저장된 참조 주소값이 저장됨 a, b는 동일한 주소를 참조중 a, b중 하나의 값이 바뀌어도 같이 바뀜
		// 변경 전 출력
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// 변경 후 출력
		a[0] = 10;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}

		
		// (2) 깊은 복사
		// 배열 객체를 새로 생성하여 원본의 원소를 하나씩 저장 개별 배열이 복사됨
		// Object.clone(), Arrays.copyOf(), Arrays.copyOfRange(), System.arraycopy() 등의 메서드가 있음
	
		int[] a1 = {1,2,3,4};
		int[] b1 = new int[a1.length];
		
		System.out.println();
		for(int i=0; i<a1.length; i++) {
			b1[i] = a[i]; // 깊은 복사
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		b1[0] = 20;
		for(int i=0; i<b1.length; i++) {
			System.out.print(b1[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		
		// 2. Object.clone() -> Object를 모든 클래스는 상속받기 때문에 배열객체에도 Object의 clone() 메소드가 있음
		int[] a2 = {1,2,3,4};
		int[] b2 = a2.clone();
		
		System.out.println("Object.clone() 활용한 깊은 복사");
		for(int i=0; i<a2.length; i++) {
			System.out.print(a2[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		for(int i=0; i<b2.length; i++) {
			System.out.print(b2[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		a2[0] = 10;
		for(int i=0; i<a2.length; i++) {
			System.out.print(a2[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		for(int i=0; i<b2.length; i++) {
			System.out.print(b2[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		
		// 3. Arrays
		// Arrays.copyOf(원본 배열, 배열 길이) - 새로운 배열 객체 생성 후 반환
		// Arrays.copyOfRange(원본 배열, 시작, 끝) - 새로운 배열 객체 생성 후 반환
		int[] a3 = {1,2,3,4};
		int[] b3 = Arrays.copyOf(a3, a3.length);
		int[] b3One = Arrays.copyOfRange(a3, 1, 3); // index 1, 2 두개
		
		System.out.println("Arrays.copyOf() 활용한 깊은 복사");
		for(int i=0; i<a3.length; i++) {
			System.out.print(a3[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		for(int i=0; i<b3.length; i++) {
			System.out.print(b3[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		a3[0] = 10;
		for(int i=0; i<a3.length; i++) {
			System.out.print(a3[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		for(int i=0; i<b3.length; i++) {
			System.out.print(b3[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		
		System.out.println("Arrays.copyOfRange() 활용한 깊은 복사");
		for(int i=0; i<b3One.length; i++) {
			System.out.print(b3One[i] + " "); // 이번엔 출력값이 다름
		}
		System.out.println();
		// 배열 크기 변경 불가능 - 더 큰 배열 필요 시 새 배열 생성 후 기존 배열 원소 복사
		int[] a5 = {1,2,3,4};
		int[] b5 = new int[10];
		
		System.out.println();
		for(int i=0; i<a5.length; i++) {
			b5[i] = a5[i]; // 깊은 
		}
		
		for(int i=0; i<b5.length; i++) {
			System.out.print(b5[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문 : 참조 객체 중 배열 또는 컬렉션의 항목요소를 순차적으로 처리
		// index 이용하지 않고 바로 항목 요소 반복 가능
		// for(반복 변수 : 배열 또는 컬렉션){반복 문자}
		// 배열의 모든 원소 순회 사용할 경우 사용
		int sum = 0;
		int[] scores = {95, 71, 84, 93, 87};
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println();
		System.out.println("Sum의 값 : " + sum);
		
		String[] flowers = {"해바라기", "장미", "진달래"};
		for(String flower : flowers) {
			System.out.print(flower + " ");
		}
	}
}
