package sec06.ch08;

public class ExceptionExam3 {
	public static void main(String[] args) {
		Calc2 c = new Calc2();
		int result = 0;
		
		try {
			result = c.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace(); // �ֿܼ� ���� �����
			System.out.println("���ܰ� �߻��ȴٸ� ó���ϰ� ���� �����");
		} finally {
			System.out.println("������ ����");
		}
		
		System.out.println("result : " + result);
	}
}

class Calc2 {
	// ���ܰ� �߻��ϸ�,, ���ܸ� ������!
	// �� �޼ҵ带 ������ ������ ����ó�� �ؾ���
	// ����ó���� ��Ȳ�� ���� �ٸ��� �� �� ����
	int div(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}