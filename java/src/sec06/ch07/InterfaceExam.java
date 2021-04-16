package sec06.ch07;

public class InterfaceExam {
	public static void main(String[] args) {
		
		// 인터페이스 명은 주로 형용사 
		RemoteControl rc1 = new LGtv();
		RemoteControl rc2 = new SAMSUNGtv();

		rc1.volumeUp();
		rc2.volumeUp();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
	}
}
