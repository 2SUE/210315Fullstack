package sec06.ch07.starcraft;

public class Marine implements Bionic {
	// 보통 생성자나 메소드를 통해 값 넣어줌
	private int currentHP = 10;
	public final int MAXHP = 20;
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
}
