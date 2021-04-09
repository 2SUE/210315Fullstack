package sec06.ch06.blackjack;

public class CardDeck {
	// 레퍼런스 변수 final은 주소값은 못 바꾸지만 값은 바꿀 수 있음
//	private final Card[] CARD_ARR = new Card[52]; // 값을 바로 넣어주는,, 명시적 할당

	private final int SB = 13;
	private final Card[] CARD_ARR = new Card[52];
//	private final Card[] CARD_ARR;
	private final String[] CARD_PATTERNS = {"Spades", "Hearts", "Diamonds", "Clubs"};
	private final String[] CARD_SYMBOLS = {"A", "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K"};  
	int cnt = 0;
	
	public CardDeck() { // 클래스 접근범위에 맞춰서,,
		// super(); 기본으로 들어감~!
		init();
	}
	
//	private void init() {
//		int idx = 0;
//		for (int i = 0; i < CARD_PATTERNS.length; i++) {
//			for (int j = 0; j < SB; j++) {
//				String symbol = null;
//				switch(j) {
//				case 1: symbol = "A"; break;
//				case 11: symbol = "J"; break;
//				case 12: symbol = "Q"; break;
//				case 13: symbol = "K"; break;
//				default: symbol = String.valueOf(j);
//				}
//				CARD_ARR[idx++] = new Card(CARD_PATTERNS[i],  symbol);
//			}
//		}
//	}

	private void init() {
		
		for(int i = 0; i < CARD_PATTERNS.length; i++) {
			for(int j = 0; j < CARD_SYMBOLS.length; j++) {
				CARD_ARR[cnt++] = new Card(CARD_PATTERNS[i], CARD_SYMBOLS[j]);
			}
		}
	
		for(String pattern : CARD_PATTERNS) {
			for(String symbol : CARD_SYMBOLS) {
				CARD_ARR[cnt++] = new Card(pattern, symbol);
			}
		}
		for (Card i : CARD_ARR) {
			System.out.println(i);
		}
	}
}
