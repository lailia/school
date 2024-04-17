package chap05.sec10;

public class AdvancedExam1 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};	//배열 변수 선언
		int sum = 0;
		
		for(int score : scores) {
			sum += score;	//sum = 95 + 71 + 84 + 93 + 87
		}
		
		System.out.println("sum : " + sum);
		
		double avg = (double)sum/scores.length;
		
		System.out.println("avg : " + avg);
		
	}

}
