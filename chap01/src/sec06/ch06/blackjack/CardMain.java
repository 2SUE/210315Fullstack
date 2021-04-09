package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", "K");
		System.out.println(c1); // Spade (K)

//		println은 toString() 메소드 호출함 => String을 받는 println 함수로 귀결됨
		
		Card c2 = new Card("Heart", "2");
		System.out.println(c2); // Heart (2)

		Card c3 = new Card("Club", "J");
		System.out.println(c3); // Club (J)		
		
		CardDeck carddeck = new CardDeck();
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