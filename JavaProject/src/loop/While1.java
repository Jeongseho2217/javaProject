package loop;

public class While1 {

	public static void main(String[] args) {
		// 조건식만 필수로 존재하는 반복문, while
		/*
		 * while(1==1) { // 1 == 1무한 루프 System.out.println("여러 번 실행"); }
		 */
		
		int i = 0;
		
		while(i <=10) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		
		while(i <=10) {
			i++;
			System.out.println(i);
		}

	}

}
