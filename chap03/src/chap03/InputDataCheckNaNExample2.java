package chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// "NaN"을 체크하고 연산 수행
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val =0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
