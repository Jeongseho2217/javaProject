package collection.list;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// 제네릭 사용 x list
		ArrayList ar = new ArrayList();
		//list.add(객체) 객체를 현재 list에서 비어있는 첫번째 원소에 저장
		ar.add(100);
		ar.add("홍길동");
		ar.add(5.777);
		ar.add("자바");
		
		//list.get(index) : 해당 index 원소의 값을 반환
		//list.size() : list 원소 수 반환
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		// list.add(idx, 값)
		ar.add(0, "변경"); // 가장 첫 칸에 삽입 -> 나머지 칸은 모두 한칸씩 밀려 (이동연산이 증가, 많이 길어짐)
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		//list.contains(value) : 리스트에 해당 값이 있는지 확인
		if((!ar.contains("홍길동"))) {
			ar.add("홍길동");
		}
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
