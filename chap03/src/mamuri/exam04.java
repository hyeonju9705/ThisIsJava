package mamuri;

public class exam04 {

	public static void main(String[] args) {
		// 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ �������� �� � �������ְ�, �������
		int pencils = 534;
		int students = 30;
		
		//�л� �Ѹ��� ������ ���� ��
		int pencilsPerStudent = ( pencils/students);
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
	}

}
