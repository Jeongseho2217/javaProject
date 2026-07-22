package loop;

public class ForNested {

	public static void main(String[] args) {
		// 중첩 for문
		
		for(int i = 1; i <=3; i++) { // 3번 반복
			for(int j = 1; j <=5; j++) { // 5번 반복을
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for(int m = 2; m <=9; m++) { // 단을 결정
			System.out.println("<<=====" + m + "단=====>>");
			for(int n = 1; n <=9; n++) { // 5번 반복을
				System.out.println(m + "X" + n + "=" + m * n);
			}
		}
	}
}
