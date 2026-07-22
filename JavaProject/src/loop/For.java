package loop;

public class For {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.print("i 최종값 : ");
		System.out.println(i);
		
		for(int j=20; j<=30; j+=2) {
			System.out.println(j);
		}
		//System.out.print("j 최종값 : ");
		//System.out.println(j); int j를 for 문 안에 정의해놨음
		
		int k, result = 0;
		
		for(k = 1; k<=100; k++) {
			result += k;
		}
		System.out.print("1~" + (k-1) + "합 : " + result);
	}

}
