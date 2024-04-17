package chap05.sec7;

public class ArrayExam4 {

	public static void main(String[] args) {
		int[] scores = {85, 96, 75};
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 : " + avg);

	}

}
