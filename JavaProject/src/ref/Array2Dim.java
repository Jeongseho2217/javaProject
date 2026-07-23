package ref;

public class Array2Dim {

	public static void main(String[] args) {
		// 다차원 배열 : 차원에 따라 []의 수를 늘려주면 됨 [][] 2차원 [][][] 3차원
		int[][] a = new int[3][4];
		// 2차원 배열의 초기화 : 선언 + 기억 장소 할당 + 원소에 값 저장
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // 3열4행
		char[][] c = {{'a', 'b', 'c'},{'d', 'e', 'f'}}; // 2열3행
		
		System.out.println(c[0][2]);
		
		for(int i = 0; i < 2; i++) { // 행
			for(int j=0; j<3; j++) { // 열
				System.out.println(c[i][j]);
			}
		}
		
		// 2차원 배열의 행을 접근해서 출력
		for(int i = 0; i < c.length; i++) { // 행
			System.out.println(c[i]);
		}
		System.out.println(c); // [[C@1f32e575 / 주소가 [[ 으로 시작 = 2차원 배열
		
		
		// 길이로 조건 검사 진행 배열.length, 배열[index].length
		for(int i = 0; i < c.length; i++) { // 행
			for(int j=0; j< c[i].length; j++) { // 열
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
