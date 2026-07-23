package exam;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[5];
		int gram[] = new int[5];
		int list[] = new int[5];
		int read[] = new int[5];
		
		int sum[] = new int [5];
		int i = 0;
		int grade = 0;
		
		System.out.println("*** 영어 시험 점수 입력 ***");
		while (i < name.length) {
			System.out.print((i + 1) + "번 성명 입력: ");
			name[i] = sc.next();
			
			System.out.print((i + 1) + "번 문법 점수 입력: ");
			gram[i] = sc.nextInt();
			sum[i] += gram[i];
			
			System.out.print((i + 1) + "번 듣기 점수 입력: ");
			read[i] = sc.nextInt();
			sum[i] += read[i];
			
			System.out.print((i + 1) + "번 독해 점수 입력: ");
			list[i] = sc.nextInt();
			sum[i] += list[i];
			
			System.out.print("계속 입력하시겠습니까? (y입력하면 계속) : ");
			String input = sc.next();
			if (!input.equals("y")) {
				break;
			}
			i++;
		}
		
		System.out.println();
		System.out.println("*** 영어 시험 결과 ***");
		for(int j = 0; j < name.length; j++) {
			switch(sum[j] / 200) {	
			case 5:
			case 4: {
				grade = 1; break;
			}
			case 3: {
				grade = 2; break;
			}
			case 2: {
				grade = 3; break;
			}
			default: 
				grade = 4; break;
			}
			if (name[j] == null) {
				sc.close(); return; 
				}
			System.out.println((j + 1) + "번 " + name[j] + " " + sum[j] + " " + grade + "등급");
		}
		sc.close();
	}

}
