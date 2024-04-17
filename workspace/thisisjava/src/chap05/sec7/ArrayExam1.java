package chap05.sec7;

public class ArrayExam1 {

	public static void main(String[] args) {
		String[] season = {"spring", "summer", "fall", "winter"};
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		System.out.println();
		
		for(int i = 0; i < season.length; i++) {
			System.out.println("season[" + i + "] : " + season[i]);
		}
		
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		
		int[] scores = {83, 90, 87, 99};
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
