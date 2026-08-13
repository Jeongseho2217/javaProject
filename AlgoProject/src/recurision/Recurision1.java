package recurision;

public class Recurision1 {
	// n + (n - 1) + (n - 2) + ... + 1
	public static void main(String[] args) {
		System.out.println("n + (n - 1) + ... + 1의 계산 결과 : " + sum(10));
		
		System.out.println("피보나치 수열 : " + Fibonacci(11));
	}
	
	static int sum(int n) { // 재귀 함수
		if (n == 1) {
			return 1;
		}
		else return n + sum(n-1);
	}
	
	static int Fibonacci(int n) { // 피보나치 수열
		
		if (n == 1) return 1;
		else if (n <= 0) return 0;
		else return Fibonacci(n-2) + Fibonacci(n-1);
	}
}