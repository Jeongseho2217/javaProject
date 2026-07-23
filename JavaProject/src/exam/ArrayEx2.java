package exam;

import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int lotto[] = new int[6];
		
		O:for(int i = 0; i < lotto.length; i++) {
			int randNum = rd.nextInt(45) + 1;
			for(int j = 0; j < lotto.length; j++) {
				
				if (lotto[j] == randNum) {
					i--; // 빠꾸
					continue O;
				}
			}
			lotto[i] = randNum;
			System.out.print(lotto[i] + " ");
		}
	}
}
