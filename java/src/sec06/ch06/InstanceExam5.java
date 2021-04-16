package sec06.ch06;

public class InstanceExam5 {
	public static void main(String[] args) {
		Car[] carArr = new Car[5];// 5개의 Car 객체를 담을 수 있다!
		
		Car car = createCar();
		
		System.out.println(car);
		
//		Car car = null; NullPointerException                                                                                                         
	}
	public static Car createCar() {
		return new Car();
	}
}