package chap04.sec4;

public class WhileExam2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			System.out.println("i : " + i);
			sum+=i++;
		}

		System.out.println("sum : " + sum + ", i : " + i);
		
	}

}
