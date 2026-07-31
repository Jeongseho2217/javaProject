package api.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// seed값 없는 랜덤 객체 정수형 난수
		Random random = new Random();
		
		for (int i = 0; i <10; i++) {
			System.out.println(random.nextInt(10)+1+" "); // 1-10사이의 난수, 실행시마다 서로 다른 난수
		}
		
		System.out.println("-------------------------------");
		
		// seed값 있는 랜덤 객체 정수형 난수
		Random random1 = new Random(312435124);
		
		for (int i = 0; i <10; i++) {
			System.out.println(random1.nextInt(10)+1+" "); // 1-10사이의 난수, 실행시마다 서로 다른 난수
		}
		
	}

}
