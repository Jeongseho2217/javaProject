package process;

public class ProcessEx {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			if(i % 2 == 1) sum += i;
			else sum -= i;
			i++;
		}
		System.out.println("1-2+3-4 .... +99-100의 합 : " + sum);
	}
}
