package exam;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Second = 0;
		int Hour = 0; int Min = 0; int Sec = 0;
		System.out.print("시간 입력 (초) : ");
		Second = sc.nextInt();
		int temp = Second; // 마지막 계산에 쓸 초 단위 저장
		Hour = Second / 3600; // 3600으로 나눠서 시 구하기
		Second = Second % 3600; // 나눈 나머지로 분 구해야함
		Min = Second / 60; // 60 으로 나눠서 분 구하기
		Sec = Second % 60; // 남은 건 초
		
		System.out.print(temp + "초는 " + Hour +"시간, " + Min +"분, " + Sec +"초입니다.");
		
		sc.close();
		
	}

}
