package loop;

public class Continue {
	public static void main(String[] args) {
		// continue : 현재 반복문 중단하고 다음 반복문 진행
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				continue; // --> 출력 스킵하고 다시 for 상단으로
			}
			System.out.println(i);
		}
	}
}
