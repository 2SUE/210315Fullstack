package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {

	public static void main(String[] args) {
		
		// 컬렉션 : 여러 개의 값을 저장할 수 있는 것들 ex) Array, List, ...
		
		// 수정이 잦을 때 : LinkedList
		// 출력 위주 : ArrayList
		List list = new ArrayList();  // 유동적으로 크기가 변함
		
		list.add(10);
		list.add(10.1);
		list.add("ddd");
		list.add(new Card("", ""));

		// Object로 넘어와서 형변환 필수
		int val1 = (int)list.get(0); 
		System.out.println("val1 : " + val1);
		
		Object obj = list.get(1);
		double val2 = (double) obj;
		System.out.println("val2 : " + val2);
		
	}

}