package chap05.sec8;

public class MultiArrayExam1 {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76,88}};
		
		System.out.println("반의 수 : " + scores.length);
		System.out.println("첫번째 반의 학생 수 : " + scores[0].length);
		System.out.println("두번째 반의 학생 수 : " + scores[1].length);
		System.out.println();
		
		System.out.println("첫번째 반의 첫번째 학생 : " + scores[0][0]);
		System.out.println("첫번째 반의 두번째 학생 : " + scores[0][1]);
		System.out.println("첫번째 반의 세번째 학생 : " + scores[0][2]);
		System.out.println("두번째 반의 첫번째 학생 : " + scores[1][0]);
		System.out.println("두번째 반의 두번째 학생 : " + scores[1][1]);
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println((i + 1) + "반의 " + (j + 1) + "번째 학생의 점수 : " + scores[i][j]);
			}
		}
		System.out.println();
		
		int[] sum = {0, 0};
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			System.out.println((i + 1) + "반의 점수 총합 : " + sum[i]);
			System.out.println((i + 1) + "반의 평균 점수 : " + ((double)sum[i]/scores[i].length));
		}

	}

}
