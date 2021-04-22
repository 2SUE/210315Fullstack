package sec06.ch08;

import java.sql.*;

public class ExceptionExam4 {
	public static void main(String[] args) {
		// 싱글톤 : 프로그램 안에서 객체 1개만 만들어지도록 유도
		// 2개 이상 만들 수 없도록 한다.
		// 직접 구현하지 말어라~~~~~
	
		DbUtils du = DbUtils.getInstance();
		DbUtils du2 = DbUtils.getInstance();
		
		System.out.println(du);
		System.out.println(du2);
		System.out.println(du == du2);
	}
}

class DbUtils {
	
	private DbUtils() {} // 외부에서 생성하지 못하게 (객체화 막음)
	private static DbUtils dbutils;
	
	public static DbUtils getInstance() {
		if(dbutils == null) {
			dbutils = new DbUtils();
		}
		return dbutils;
	}
	
	Connection getCon() { // DB 연동할 때 쓴다고 함니다~
		Connection con = null; // 지역변수는 초기화해야함
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 생략해도 댐
							 // jdbc:mysql://ip주소:포트번호/DB명
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			// getConnection()에 throws 어쩌구가 있어서 사용하려면 예외처리 해야댐
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD); // static 메소드 (객체화 하지 않고 사용)
			System.out.println("접속 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패!");
		}
		return con;
	}
}

/*
	final 붙일 수 있는 곳
	- 멤버 필드 : 값 수정 금지됨
	- 함수 : 오버라이딩 금지됨
	- class : 상속 금지됨
*/