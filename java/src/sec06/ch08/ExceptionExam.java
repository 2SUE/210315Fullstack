package sec06.ch08;

public class ExceptionExam {
	public static void main(String[] args) {
		// try ~ catch : 1set
		// finally : option

		System.out.println("������ �߻��ϴ� �ڵ�");
		
		try { // ���ܰ� �߻��� ���ɼ��� ���� �ҽ��� ��ġ
			System.out.println("����ó���� �غ���!");
			int result = 10 / 0; // ���ܰ� �߻��ϸ� catch�� �Ѿ
			System.out.println("result : " + result);

				// ������ ���õ� ������ �Ѿ��
		} catch (Exception e) { // try������ ������ �߻��ϸ� catch�� �Ѿ��
			e.printStackTrace(); // ���� �˷���
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");

		} finally { // ������ ������ �� ������ ������ ����
			System.out.println("������ ����!!!!");
		}

		System.out.println("~��~");
		
		System.out.println("\n������ �߻����� �ʴ� �ڵ�");
		
		try {
			System.out.println("����ó���� �غ���!");
			int result = 10 / 20; 
			System.out.println("result : " + result);

		} catch (Exception e) { 
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");

		} finally {
			System.out.println("������ ����!!!!");
		}

		System.out.println("~��~");
	}
}
