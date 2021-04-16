package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45};
		
		// System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result); // 4, 8, 10, 11, 45,
	}	
	
	public static String toString(int[] arr) {
		
//		String result = "";
//		for(int i = 0; i < arr.length; i++) {
//			if(i != 0) {
//				result += ", ";
//			}
//			result += arr[i];
//		}
		
		String result = "" + arr[0]; // Integer.toString(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			result += ", " + arr[i];
		}
		return String.format("[%s]", result);
	}
}
