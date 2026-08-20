package sort;

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] arr = new int[] {5,3,8,1,2,7};
		
		bubbleSort(arr);
		
	}
	
	static void bubbleSort(int[] arr) {
		int temp;

		
		for(int i=0; i<arr.length; i++) {
			int bf = i + 1;
			for(int j =0; j< arr.length - bf; j++) { // 라운드 순회마다 가장 큰 원소가 하나씩 결정됨, 비교가 줄어듦 i변수가 비교횟수 결정
				if(arr[j] > arr[j+1]) { // 인접 원소와 비교 앞쪽이 더 크면 교체
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int j =0; j< arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("정렬 결과 : ");
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
