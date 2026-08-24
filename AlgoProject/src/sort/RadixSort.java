package sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	private static int BUCKET_NUM = 10;
	
	public static void sort(int[] arr) {
		Queue<Integer>[] bucket = new LinkedList[BUCKET_NUM];
		
		for(int i=0; i<BUCKET_NUM; i++) {
			bucket[i] = new LinkedList<>();
		}
		// 정렬 대상에서 가장 자리수가 큰 수의 자리수 반환
		int maxLen = maxDigitCount(arr);
		int digitNumber = 0;
		int arrIndex = 0;
		
		// 자리수 만큼 버킷에 넣고 빼기
		for(int i=0; i<maxLen; i++) {
			
			int currentPlace = (int) Math.pow(10, i); // 현재 몇의 자리인지
			
			for(int j=0; j<arr.length; j++) {
				digitNumber = getDigit(arr[j], i); // 현재 원소값의 지정된 자리수 값을 반환
				// 버킷을 결정해서 저장
				bucket[digitNumber].add(arr[j]); 
			}
			// 버킷에 들어간 데이터를 순서대로 꺼내서 배열에 덮어씌움
			for(int j=0; j<BUCKET_NUM; j++) {
				while(!bucket[j].isEmpty()) {
					arr[arrIndex++] = bucket[j].remove();
				}
			}
			arrIndex=0;
			System.out.printf("%d의 자리 정렬 후 : %s\n", currentPlace, Arrays.toString(arr));
		}
	}

	private static int getDigit(int n, int idx) {
		// getDigit(123, 0) >> 3 자리수 반환
		return (int)Math.floor(Math.abs(n) / Math.pow(10, idx)) % 10;
	}
	
	// 숫자의 자리수 구하기 digitCount(10) -> 2
	
	private static int digitCount(int n) {
		if(n == 0) return 1;
		return (int)Math.floor(Math.log10(Math.abs(n)) + 1);
	}

	private static int maxDigitCount(int[] arr) {
		int max = 0;
		// 정렬해야하는 원소의 자리수를 구해서 배열에 저장 후 가장 큰 값을 찾아서 반환
		
		for(int i = 0; i <arr.length; i++) {
			max = Math.max(max, digitCount(arr[i]));
		}
		return max;
	}
}
