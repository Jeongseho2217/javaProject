package exam.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("apple", "사과");
		map.put("summer", "여름");
		map.put("candy", "사탕");
		map.put("school", "학교");
		map.put("water", "물");
		
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String key = sc.next();
			
			if (key == "") {
				System.out.println("종료합니다...");
				sc.close();
			}
		}
		
		
	}

}
