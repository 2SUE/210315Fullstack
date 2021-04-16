package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {

	public static void main(String[] args) {
//		    제약사항 generic Card객체 주소값만 대입, 출력 가능
		List<Card> list = new ArrayList<>();
		
		Card c1 = new Card("카드 객체", "1");
		
		list.add(c1);
//		list.add("ddd");
//		list.add(1);
		
		Card c2 = list.get(0);
		
		System.out.println(c2);
	}

}