package chap04.sec3;

public class ForExam2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i = 1; i <= 100; i++) {
			System.out.println("i : " + i);
			sum += i;	//sum = sum + i;
		}

		System.out.println("sum : " + sum);
		
	}

}
