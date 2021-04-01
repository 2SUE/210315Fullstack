package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = { 88, 65, 23, 1, 900, 45, 95 };
		
		// swapping
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
