package sec06.ch07;

public class ArrayListMission {
	public static void main(String[] args) {
//		interface		  class
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
				
						// 배열의 크기 리턴
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
	}
}