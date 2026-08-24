package sort;

// 퀵 정렬: 피벗이라는 기준값을 결정하여 피벗 기준 두개의 부분 리스트로 나눔
// 작은 / 피벗 / 큰
// 비교하면서 데이터를 찾기 때문에 비교 정렬
// 정렬 대상 데이터 외에 추가적인 공간을 필요로 하지 않는다 : in-place sort

// 1. 피벗 선택
// 2. 피벗 기준 왼쪽에서부터는 피벗보다 큰 값을 오른쪽에서부터는 피벗보다 작은값을 찾는다.
// 3. 양방향에서 찾아지면 교환한다
// 4. 양쪽 위치 idx가 서로 교차되지 않을때까지 2, 3번 반복
// 5. 교차 지점을 기준으로 두 개의 부분리스트를 나누고 각 부분리스트에 퀵정렬 과정(1-4)을 반복(devide) 분할
// 6. 인접한 부분 리스트까지 합치기 (conqure) 정복

// 피벗 선택 방법
// 가장 왼쪽/중간/오른쪽 원소로 선택 가능

public class QuickSort {
	public static void sort(int[] a) {
		l_pivot_sort(a, 0, a.length-1);
	}
	// @params a 정렬할 배열, lo 현재 부분 리스트 왼쪽
	private static void l_pivot_sort(int[] a, int lo, int hi) {
		if(lo >= hi) return;

	// 두개의 리스트로 분할 후 피벗을 반환
	int pivot = partition(a, lo, hi);
	System.out.println("왼쪽 부분 리스트");
	for(int k=lo; k<pivot; k++) {
		System.out.print(a[k] + " ");
	}
	System.out.println();
	l_pivot_sort(a, lo, pivot-1);
	
	System.out.println("오른쪽 부분 리스트");
	for(int k=pivot+1; k<=hi; k++) {
		System.out.print(a[k] + " ");
	}
	System.out.println();
	l_pivot_sort(a, pivot+1, hi);
	
	}
	
	// 피벗 기준으로 파티션을 나누기 위한 정렬 메서드
	// @params a 정렬할 배열, left 현재 부분 리스트 왼쪽 right 현재 부분 리스트 오른쪽 return 최종적으로 l, r이 교차될때 위치한 피벗의 위치 반환
	private static int partition(int[] a, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = a[left]; // 부분 리스트의 왼쪽 요소를 피벗으로 결정
	
		// 피벗과 부분리스트 원소와 대소 비교
		while(lo < hi) {
			
			// hi가 lo보다 크면서 hi요소가 pivot보다 작거나 같은 원소를 찾을 때까지 hi를 감소시킴
			
			while(a[hi] > pivot && lo < hi) { // height 포인터가 피벗보다 작은값을 찾은게 아니라면 현재 원소는 skip
				hi--;
			}
			
			while(a[lo] <= pivot && lo < hi) {
				lo++;
			}
			
			swap(a, lo, hi);
		}
				
		// 피벗으로 설정했던 위치(a[left])의 원소와 lo가리키는 원소를 교환하고 lo지점을 pivot위치로 결정
		swap(a, left, lo);
		
		System.out.println("pivot : " + a[lo]);
		for(int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		return lo;
	}
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
}
