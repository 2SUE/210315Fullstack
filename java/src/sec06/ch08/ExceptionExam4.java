package sec06.ch08;

import java.sql.*;

public class ExceptionExam4 {
	public static void main(String[] args) {
		// �̱��� : ���α׷� �ȿ��� ��ü 1���� ����������� ����
		// 2�� �̻� ���� �� ������ �Ѵ�.
		// ���� �������� �����~~~~~
	
		DbUtils du = DbUtils.getInstance();
		DbUtils du2 = DbUtils.getInstance();
		
		System.out.println(du);
		System.out.println(du2);
		System.out.println(du == du2);
	}
}

class DbUtils {
	
	private DbUtils() {} // �ܺο��� �������� ���ϰ� (��üȭ ����)
	private static DbUtils dbutils;
	
	public static DbUtils getInstance() {
		if(dbutils == null) {
			dbutils = new DbUtils();
		}
		return dbutils;
	}
	
	Connection getCon() { // DB ������ �� ���ٰ� �Դϴ�~
		Connection con = null; // ���������� �ʱ�ȭ�ؾ���
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // �����ص� ��
							 // jdbc:mysql://ip�ּ�:��Ʈ��ȣ/DB��
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			// getConnection()�� throws ��¼���� �־ ����Ϸ��� ����ó�� �ؾߴ�
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD); // static �޼ҵ� (��üȭ ���� �ʰ� ���)
			System.out.println("���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ����!");
		}
		return con;
	}
}

/*
	final ���� �� �ִ� ��
	- ��� �ʵ� : �� ���� ������
	- �Լ� : �������̵� ������
	- class : ��� ������
*/