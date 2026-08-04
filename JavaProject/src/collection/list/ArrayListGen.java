package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGen {

	public static void main(String[] args) {
		// 리스트 계열 콜렉션을 제네릭 타입으로 생성
		List<String> list = new ArrayList<String>(); 
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("MyBatis");
		list.add("JDBC");
		
		// 제네릭 타입을 문자열로 지정해 놓아서 list.add(100)이런건 안들어가짐
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		//원소 제거
		list.remove(2);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		list.remove("JDBC"); // 만약 값이 두개라면 첫번째 항목을 먼저 제거함
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println();
		
		//ArrayList도 집합이라 for문의 반복 객체로 사용 가능
		for(String str : list) {
			System.out.println(str);
			System.out.println("str 길이: " + str.length());
		}
	}
}
