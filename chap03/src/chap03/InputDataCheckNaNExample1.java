package chap03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// "NaN" 문자열의 문제점
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
