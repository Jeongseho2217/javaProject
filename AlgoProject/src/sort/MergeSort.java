package sort;

public class MergeSort { // 정렬을 위한 공간이 하나 더 필요한 정렬
	// 정렬 동안에 정렬하여 원소를 담을 임시공간
	private static int[] sorted;
	
	public static void mergeSort(int a[]) {
		sorted = new int[a.length]; 
		mergeSort(a, 0, a.length-1);
	}

	private static void mergeSort(int[] a, int left, int right) {
		// left == right, 부분리스트가 1개의 원소만 갖고 있는 경우
		// 더 쪼갤 수 없을 때 리턴
		
		if(left == right) return;
		
		//분할 결합 과정 반복
		int mid = (left + right) / 2; //절반 위치
		
		System.out.printf("분할 : [%d ~ %d]을 좌측 [%d - %d], 우측 [%d - %d]으로 나눔\n", left, right, left, mid, mid + 1, right);
		
		mergeSort(a, left, mid);
		mergeSort(a, mid+1, right);
		
		merge(a, left, mid, right); // 병합 작업 메소드 호출
	}
	// a : 정렬할 배열 / left : 배열의 시작 / right : 배열의 끝 / mid는 : 중간점
	private static void merge(int[] a, int left, int mid, int right) {
		int l = left;  // 왼쪽 시작점
		int r = mid + 1; // 오른쪽 시작점
		int idx = left; // 정렬 결과를 넣은 idx
		
		System.out.printf("병합 : [%d - %d] (mid: %d)\n", left, right, mid);
		
		while(l <= mid && r <= right) { // 각 부분리스트의 끝점을 지나지 않는 동안 반복
			
			// 왼쪽 부분리스트의 첫번째 원소 갑싱 더 작으면 / 임시배열에 왼쪽 부분 리스트의 원소를 저장
			// 
			if(a[l]<=a[r]) {
				sorted[idx] = a[l];
				idx++;
				l++;
			} else {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		// 위 반복문 종료 후 왼쪽 또는 오른쪽 리스트 중 남는 원소가 있게 됨
		// 왼쪽 리스트는 임시 배열에 모두 저장됨
		// 오른쪽 리스트에서 남은 원소를 임시배열로 저장
		if(l>mid) {
			while(r <= right) { // 오른쪽 리스트에 원소가 남아 있는 동안 
				sorted[idx] = a[r];
				r++;
				idx++;
			}
		}
		// 오른쪽 리스트는 임시 배열에 모두 저장됨
		// 왼쪽 리스트에서 남은 원소를 임시배열로 저장
		else {
			while(l <= mid) {
				sorted[idx] = a[l];
				l++;
				idx++;
			}
		}
		
		// 임시배열에 정렬된 결과를 기존의 배열에 복사하여 옮겨준다.
		for(int i=left; i<= right; i++) {
			a[i] = sorted[i];
		}
	}
}
