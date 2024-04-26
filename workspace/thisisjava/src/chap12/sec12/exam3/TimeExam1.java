package chap12.sec12.exam3;

public class TimeExam1 {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i =1; i <= scores.length; i++) {
			scores[i-1] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum/scores.length;
		
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 1000까지의 평균 : " + avg);
		System.out.println("걸린 시간 : " + (time2 - time1) + "나노초");

	}

}
