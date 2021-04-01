package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {

		// 버블 정렬
		int[] arr = { 8, 7, 3, 1, 6 };

		// for문 한 바퀴
		// 7, 8, 3, 1, 6
		// 7, 3, 8, 1, 6
		// 7, 3, 1, 8, 6
		// 7, 3, 1, 6, 8

		// for문 두 바퀴
		// 3, 7, 1, 6, 8
		// 3, 1, 7, 6, 8
		// 3, 1, 6, 7, 8

		// for문 세 바퀴
		// 3, 1, 6, 7, 8
		// 1, 3, 6, 7, 8

//		i = 5 4 3 2 1 
//		j = 0 1 2 3 4

		
		int temp = 0;
		for(int i = arr.length ; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];          
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
//87316
//