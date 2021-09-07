package mamuri;

public class Exam07 {

	public static void main(String[] args) {
		// 배열에서 최대값 구하기
		int max=0;
		int[] array = {1,5,3,8,2};
		
		for(int i=0; i<4; i++) {
			if(max<array[i]) {
				max=array[i];
		}
		}
		
		System.out.println("max: "+max);
	}

}
