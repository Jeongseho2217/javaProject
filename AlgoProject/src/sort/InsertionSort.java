package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// 삽입정렬
		int[] arr = {5,2,8,3,1};
		
		insertionSort(arr);
	}
	
	static void insertionSort(int[] arr) {
		int temp, idx; // 교환할 때 사용
		
		System.out.print("초기배열 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
		System.out.print("\n정렬 진행: ");
		// 초기 타깃 값은 2번째 원소부터 (1부터)
		for(int i = 1; i < arr.length; i++) {
			System.out.println();
			System.out.println("k 값 : " + arr[i]);
			temp = arr[i];
			idx = i - 1; // idx부터 0번 원소까지 비교 진행, 비교하다가 temp보다 큰 원소가 나타나면 이동, 교환 진행
			
			while(idx >= 0 && temp < arr[idx]) {
				System.out.print(arr[idx] + " 이동 " + "\n");
				arr[idx+1] = arr[idx];
				idx--;
			}
			// 반복문이 종료되면 앞의 원소가 k값 보다 적다는 의미
			// k원소는 index 원소보다 오른쪽에 와야 하므로
			// index + 1에 위치
			
			arr[idx + 1] = temp;
			
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("정렬된 배열 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
