package sec06.ch06.blackjack;

public class CardDeck {
	// 레퍼런스 변수 final은 주소값은 못 바꾸지만 값은 바꿀 수 있음
	// private final Card[] CARD_ARR = new Card[52]; // 값을 바로 넣어주는,, 명시적 할당

	private final Card[] CARD_ARR = new Card[52];
	private final String[] CARD_PATTERNS = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private final String[] CARD_SYMBOLS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	int cnt = 0;

	// 생성자가 있으면 final 변수를 초기화 안 시켜도 됨
	// 생성자에서 해당 final 변수에 값 줘야댐
	public CardDeck() { // 클래스 접근범위에 맞춰서,,
		// super(); 기본으로 들어감~!
		for (String pattern : CARD_PATTERNS) {
			for (String symbol : CARD_SYMBOLS) {
				CARD_ARR[cnt++] = new Card(pattern, symbol);
			}
		}

		for (Card card : CARD_ARR) {
		}
	}
	
	private int getRandomIdx() {
		return (int) (Math.random() * CARD_ARR.length);
	}

	public Card getOneCard() {
		
		// 1 
//		while (true) {
//			int ran = (int) (Math.random() * CARD_ARR.length);
//			
//			if (CARD_ARR[ran] != null) {
//				Card one = CARD_ARR[ran];
//				CARD_ARR[ran] = new Card(null, null);
//				return one;
//			}
//		}
		
		// 2
//		Card chooseCard = null;
//		
//		do {
//			int ran = (int) (Math.random() * CARD_ARR.length);
//			chooseCard = CARD_ARR[ran];
//			CARD_ARR[ran] = null;
//		} while ( chooseCard == null );
//		
//		return chooseCard;
		
		// 3
		Card c = null;
		int idx = 0;
		do {
			idx = getRandomIdx();
			c = CARD_ARR[idx];
		} while (c == null);
		
		CARD_ARR[idx] = null;
		
		return c;
	}
	
	public void printAll() {
		for(Card i : CARD_ARR) {
			System.out.println(i);
		}
	}
}