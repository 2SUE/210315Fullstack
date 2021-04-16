package sec06.ch06.blackjack;

// 예제 출처 : https://jojoldu.tistory.com/62
// 카드뭉치, 카드, 메인 총 3개의 클래스
public class Card {
	private String pattern = "spade";
	private String symbol = "k";

	// 클래스가 public이면 생성자도 public
	public Card(String pattern, String symbol) {
		super();
		this.pattern = pattern;
		this.symbol = symbol;
	}
	
	public String getPattern() {
		return pattern; // this.pattern 적어주거나 말거나
	}
	
	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", pattern, symbol);
	}
}