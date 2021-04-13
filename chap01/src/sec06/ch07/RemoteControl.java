package sec06.ch07;

// 선언부만 가질 수 있다,, 구현부 x
// 상수만 사용 가능. 변수 x
public interface RemoteControl {
	
	// 자동으로 public final static이 붙음
	/* public final static */ int AGE = 10; 
	
	// 자동으로 public abstract이 붙음
	/* public abstract */ void volumeUp();
	/* public abstract */ void volumeDown();
	/* public abstract */ void chkVolume();
	
	// 인터페이스는 구현부가 없기 때문에 다중 상속해도 문제 x
}

/*
 	[ 추상클래스 ]			[ 인터페이스 ]
 	
 			   객체화 불가능			
			   부모타입 역할		 	
 			자식한테 강제성 부여	
 		자식한테 추상 메소드 오버라이딩
 	
 	다중 상속 x			다중 상속 o
 	변수 가질 수 있음		변수 가질 수 없음
 	상수 가질 수 있음		상수만 가질 수 있음	
 	구현부 있는 메소드 o	 	구현부 있는 메소드 x
 	추상 메소드 가질 수 있음	추상 메소드만 가질 수 있음
*/