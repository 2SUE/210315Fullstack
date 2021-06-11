package practice1;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52];
	private final String[] CARD_PATTERN = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private final String[] CARD_SYMBOL = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	int idx = 0;

	public CardDeck() {
		init();
	}

	public void init() {
		
		for(String i : CARD_PATTERN) {
			for(String j : CARD_SYMBOL) {
				CARD_ARR[idx++] = new Card(i, j);
			}
		}
		
		for (Card card : CARD_ARR) {
			System.out.println(card);
		}
	}
}
