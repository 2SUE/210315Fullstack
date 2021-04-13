package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam3 {

	public static void main(String[] args) {
		
		//  Wrapper Class
		List<Integer> list = new ArrayList();
		
		Integer num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
						// 배열의 크기 리턴
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
		
		System.out.println("for each문 사용 가능");
		
		for(int n : list) {
			System.out.println(n);
		}
		
	}
}