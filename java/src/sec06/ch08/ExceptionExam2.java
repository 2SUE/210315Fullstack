package sec06.ch08;

public class ExceptionExam2 {
	public static void main(String[] args) {
		// Calc ��üȭ, div() 10, 2 �ƱԸ�Ʈ�� ȣ��
		// ���ϰ� �ް� �ֿܼ� ���
		Calc c = new Calc();
		int result = c.div(10, 10);
		System.out.println(result);

		System.out.println("-----------");

		System.out.println(c.div(10, 0));
	}
}

class Calc {
	int div(int n1, int n2) {
		try {
			return n1 / n2;
//			return result - ���⿡�� return�� ������ ��ȯ�Ǵ� ���� ��� ������
		} catch (Exception e) {
			System.out.println("���� �߻�");
		} finally { // ���ܰ� �߻����� �ʾƵ� ����
			System.out.println("������ ����");
		}
		System.out.println("try �� ����"); // ���ܰ� �߻����� ������ ���� �� ��
		return 0;
	}
}