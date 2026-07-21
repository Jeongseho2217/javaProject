package operators;

public class BitShiftEx {

	public static void main(String[] args) {
		// << 왼쪽 시프트 오른쪽은 0으로 채워짐
		// >> 오른쪽 시프트 왼쪽은 부호비트(최상위 비트값)으로 채워짐
		// >>> 오른쪽 시프트 왼쪽은 무조건 0으로 채워짐
		
		System.out.println("1 << 3 = " + (1 << 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		// 주소 핸들링에 유용
	}

}
