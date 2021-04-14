package sec06.ch07;

public class ArrayListMission {
	public static void main(String[] args) {
//		interface		 자동형변환		 class
		MyList list = /* (MyList) */ new MyArrayList();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		
		list.add(2,30); // 2번 인덱스에 30추가
		
//		int val = list.remove(); // 마지막 값 삭제
//		System.out.println("val : " + val);
		
		int delVal = list.remove(1); // 1번 인덱스 삭제
		System.out.println("delVal : " + delVal);		
		
						// 배열의 크기 리턴
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
	}
}