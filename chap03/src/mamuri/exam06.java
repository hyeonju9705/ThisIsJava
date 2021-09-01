package mamuri;

public class exam06 {

	public static void main(String[] args) {
		// 사다리꼴의 넓이를 구하는 코드, 정확히 소수자릿수가 나올 수 있게 하기
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((((double)lengthTop+lengthBottom)*height)/2);
		System.out.println(area);
	}

}
