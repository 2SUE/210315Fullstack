package sec06.ch07;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();

		// bus, LocalBus 객체라면 openDoor() 호출
		// 외엔 hook() 호출
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
	}

	public static void blowKlaxon(Car c) {
		if (c instanceof Bus) {
//			((Bus) c).openDoor();
			
			// 이게 더 많이 쓰임
			Bus bus = (Bus) c;
			bus.openDoor();
		} else {
			c.hoot();
		}
	}
}