package sec06.ch06;

public class AccessExam {
	public static void main(String[] args) {
		/*
		   ----------------------------------------------------------------	
		 				private 	default 	protected		public
		   ----------------------------------------------------------------	
		 		class	   O		   O			O			   O
		   ----------------------------------------------------------------	
		 		패키지	   X		   O		    O			   O
		   ----------------------------------------------------------------		
		 		상속관계	   X	 	   X			O			   O
		   ----------------------------------------------------------------	
		 		전체		   X	 	   X			X			   O
		   ----------------------------------------------------------------	
		*/
		
		Access a = new Access();
//		a.num = 14;
		a.printNum();
	}
}

class Access { // public or default 하지만 public은 같은 파일 명인 클래스에서만 사용 가능
	private int num; // 해당 클래스를 벗어나면 접근 불가
	
	void printNum() {
		System.out.println("num : " + num);
	}

}
