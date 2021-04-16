package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
//		Card c1 = new Card("Spade", "K");
//		System.out.println(c1); // Spade (K)

//		println은 toString() 메소드 호출함 => String을 받는 println 함수로 귀결됨
		
//		Card c2 = new Card("Heart", "2");
//		System.out.println(c2); // Heart (2)
//
//		Card c3 = new Card("Club", "J");
//		System.out.println(c3); // Club (J)		

		CardDeck cd = new CardDeck();
		
		Card card1 = cd.getOneCard();
		Card card2 = cd.getOneCard();
		Card card3 = cd.getOneCard();
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		
		System.out.println("-------------");
		
		cd.printAll();
	}
	
//	public static void println(String str) {
//		 System.out.println(str);
//	}
//	
//	public static void println(Object obj) {
//		 System.out.println("obj");
//		 String str = obj.toString();
//		 println(str);
//	}
}