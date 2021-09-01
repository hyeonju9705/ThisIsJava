package mamuri;

public class Exam08 {

	public static void main(String[] args) {
		// % 연산을 수행한 결과값에 10을 더하는 코드입니다. NaN값을 검사하는 코드작성
		double x =5.0;
		double y =0.0;
		
		double z = x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z +10;
			System.out.println("결과: "+result);
		}
	}

}
