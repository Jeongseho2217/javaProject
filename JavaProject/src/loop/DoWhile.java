package loop;

public class DoWhile {

	public static void main(String[] args) {
		// for while과 달리 1회 실행하고 조건 검사를 진행 (최소 한번은 실행)
		int i = 0;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		i = 100;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
