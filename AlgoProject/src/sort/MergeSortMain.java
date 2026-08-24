package sort;

import java.util.Arrays;

public class MergeSortMain {

	public static void main(String[] args) {
		int[] orig = {5,3,8,4,9,1,6,2,7};
		
		System.out.println("원본 배열 : " + Arrays.toString(orig) + "\n");
		MergeSort.mergeSort(orig);
		System.out.println("\nMerge sort 후 : " + Arrays.toString(orig));

	}

}
