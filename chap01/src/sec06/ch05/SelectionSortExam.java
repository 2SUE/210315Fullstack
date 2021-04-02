package sec06.ch05;

import java.util.Arrays;

public class SelectionSortExam {
	public static void main(String[] args) {
		
		// 선택 정렬
		int[] arr = { 8, 7, 3, 1, 6, 0 };
		
		for (int i = 0; i<arr.length-1;i++) {
			
			int minIdx = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
