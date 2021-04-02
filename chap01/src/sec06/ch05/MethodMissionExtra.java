package sec06.ch05;

import java.util.Arrays;

public class MethodMissionExtra {
	public static void main(String[] args) {
		final int START_NUM = 5;
		final int END_NUM = 10;
		
		int rNum = 0;
		int[] index = new int[END_NUM - START_NUM + 1]; // 5~10의 값 추가
		int[] cnt = new int[index.length]; // ex)5,10 => 6
		for(int i=0; i<index.length;i++) {
			index[i] = 5+i;
		}
		for(int i=0; i<10000;i++) {
			rNum = getRandom(5, 10);
			cnt[rNum-START_NUM]++; // ex)5가 나옴 => [5-5] 에 값 추가
//			System.out.println(rNum);
		}
		System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(cnt));
		
		int total = 0;
		for (int i : cnt) {
			total+=i;
		}
		System.out.println(total);
				
	}
	
	public static int getRandom(int min, int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
}
