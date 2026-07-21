package operators;

public class IncreaseOperator {

	public static void main(String[] args) {
		//단항 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------------------");
		// 단독으로 쓰이면 순서는 상관 x
		x++; // x = x+1후위
		++x; // x = x+1전위
		System.out.println(x);
		System.out.println("---------------------------------");
		// 단독으로 쓰이면 순서는 상관 x
		y--; // y = y+1후위
		--y; // y = y+1전위
		System.out.println(y);
		
		// 증감연산자 사용시 위치가 중요한 경우 (대입 연산자와 같이 쓸 때)
		x=10; y=10;
		z = ++x; // 전위
		System.out.println("---------------------------------");
		System.out.println(x);
		System.out.println(z);
		
		z = y++; // 후위
		System.out.println("---------------------------------");
		System.out.println(y);
		System.out.println(z);
		
		x = 1; y = 1;
		z = ++x + 10;
		int z1 = y++ + 10;
		System.out.println("---------------------------------");
		System.out.println(z);
		System.out.println(z1);
		
		// 논리 부정 연산
		boolean b1 = true;
		System.out.println("---------------------------------");
		System.out.println(!b1);
		
		// 비트 반전 연산자 : ~ 비트 데이터에 대해 0을 1로 1을 0으로 반전
		// byte, short, int, long같은 정수 타입만 피연산자가 됨
		System.out.println(~10); // 양수 10 = 00000000 00000000 00000000 00001010 -> 11111111 11111111 11111111 11110101 -11
	}

}
