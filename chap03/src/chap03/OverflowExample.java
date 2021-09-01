package chap03;

public class OverflowExample {

	public static void main(String[] args) {
		// overflow
		long x = 1000000;
		long y = 1000000;
		long z = x*y;
		System.out.println(z);
	}

}
