package classInfo;

public class Aarray2DEx2 {

	public static void main(String[] args) {
		
		int sum[] = new int [3];
		
		double[][] table = new double[5][6];
		
		int[] scores = new int[] {100, 20, 30, 40, 50};
		
		for(int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				
				switch(j) {
					case 0: {
						table[i][0] = (i + 1); // 번호
						break;
					}
					case 1: { // 국어
						table[i][1] = scores[i]; 
						break;
					}
					case 2: { // 영어
						table[i][2] = scores[i]; 
						break;
					}
					case 3: { // 수학
						table[i][3] = scores[i]; 
						break;
					}
					case 4: { //총점
						for(int k = 1; k < table[i].length - 2; k++) {
							table[i][4] += table[i][k]; //[i][1] + [i][2] + [i][3]
						}
						break;
					}
					case 5: { //평균
						table[i][5] = (table[i][4] / 3); //[i][4] + [i][4] + [i][4]
						break;
					}
				}				
			}
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		
		for(int i = 0; i < table.length; i++) { // 총점
			for(int j = 0; j < table[i].length; j++) {
				if (j == table[i].length - 1)
					System.out.print(table[i][j]);
				else
					System.out.print((int)table[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		System.out.print("총점 : ");
		for(int i = 1; i < 4; i++) { // 총점
			for(int j = 0; j < table.length; j++) {
				sum[i - 1] += table[j][i];
			}
			System.out.print(sum[i - 1] + "\t");
		}
	}
}
