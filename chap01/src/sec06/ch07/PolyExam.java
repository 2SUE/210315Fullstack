package sec06.ch07;

public class PolyExam {
	public static void main(String[] agrs) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus(); // 직계는 아니지만 자식은 맞움
		
		Bus bus1 = (Bus) car1;
		bus1.openDoor();
		bus1.hoot();
		car3.hoot();
		
		
		System.out.println("-------------- (1)");
		
		Car carP2 = new Truck();
		Truck truck1 = (Truck) carP2;
		Car carP3 = truck1;
		carP3.hoot();

		System.out.println("-------------- (2)");
		
		// 런타임에러
		
//		Car carP4 = new LocalBus();
//		Bus bus2 = new Bus();
//		LocalBus lb = (LocalBus)bus2;
//		lb.hoot();
		
		System.out.println("끝!");
	}
}