package chap04.sec8;

public class ForExam2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println("i : " + i);
				sum += i;
			}
		}
		
		System.out.println("sum : " + sum);
		
	}

}
