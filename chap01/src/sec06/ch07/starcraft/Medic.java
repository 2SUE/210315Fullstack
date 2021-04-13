package sec06.ch07.starcraft;

public class Medic implements Bionic {
	private int currentHP = 3;
	public final int MAXHP = 15;
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
				 // 개나소나 다 들어가자
	public void heal(Object unit) {
//		if (unit instanceof Bionic) {
//			
//			if (unit instanceof Marine) {
//				Marine marine = (Marine) unit;
//				marine.setCurrentHP(marine.MAXHP);
//				
//			} else if (unit instanceof Medic) {
//				Medic medic = (Medic) unit;
//				medic.setCurrentHP(medic.MAXHP);
//			}
//			
//			return;
//		}
		//  heal() 호출한 변수와 매개변수가 같을 때 허용x
		if (this == unit || !(unit instanceof Bionic)) {
			System.out.println("치료할 수 없습니다.");
			return;
		}
		
		if (unit instanceof Marine) {
			Marine marine = (Marine) unit;
			marine.setCurrentHP(marine.MAXHP);
			
		} else if (unit instanceof Medic) {
			Medic medic = (Medic) unit;
			medic.setCurrentHP(medic.MAXHP);
		}
	}
}
