package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵! 빵!");
	}
}

class Bus extends Car {
	public void openDoor() {
		System.out.println("버스 승객문을 열다.");
	}

	@Override
	public void hoot() {
		System.out.println("Bus Bang! Bang!");
	}
}

class LocalBus extends Bus {
	
	@Override
	public void openDoor() {
		System.out.println("로컬버스 승객문을 열다.");
	}
	@Override
	public void hoot() {
		System.out.println("LocalBus Bang! Bang!");
	}
}

class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("Truck Bang! Bang!");
	}	
}