package mamuri;

public class Exam08 {

	public static void main(String[] args) {
		// % ������ ������ ������� 10�� ���ϴ� �ڵ��Դϴ�. NaN���� �˻��ϴ� �ڵ��ۼ�
		double x =5.0;
		double y =0.0;
		
		double z = x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z +10;
			System.out.println("���: "+result);
		}
	}

}