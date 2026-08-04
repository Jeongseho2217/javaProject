package collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentKeyMatch {

	public static void main(String[] args) {
		// 해시 맵의 키 사용 예시
		Map<Integer, Integer> mapInt = new HashMap();
		mapInt.put(1, 95);
		mapInt.put(2, 80);
		
		mapInt.put(1, 98); // <- 교체
		
		Set<Integer> keyInt = mapInt.keySet();
		for(int key : keyInt) {
			System.out.println(mapInt.get(key));
		}
		
		System.out.println("총 entry 수 : " + mapInt.size());
		System.out.println("Key 값이 같으면 동일 entry");
		System.out.println();
		
		Student key = new Student("3", "성춘향");
		// key가 참조타입일 경우 예시
		Map<Student, Integer> mapRef = new HashMap<>();
		mapRef.put(key, 93);
		mapRef.put(new Student("1", "홍길동"), 90); // 이런것도 가능
		mapRef.put(new Student("2", "이몽룡"), 80); 
		mapRef.put(new Student("3", "성춘향"), 95);
		mapRef.put(new Student("3", "성춘향"), 98);
		
		Set<Student> keyRef = mapRef.keySet();
		for(Student key1 : keyRef) {
			System.out.println(key1.getStrNo() + " " + key1.getStrName() + " " + mapRef.get(key1));
		}
		
		System.out.println("총 entry 수 : " + mapRef.size());
		System.out.println("사용자 정의 클래스인 경우 hashcode()와 equals()를 재정의해서 동등 객체 조건을 정해야 함");
		System.out.println("사용자 정의 클래스에 동등객체 조건이 정의되지 않으면 키의 내용이 중복으로 보일 수 있음");
	}

}
