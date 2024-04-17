package chap05.sec12;

public class MatrixExam1 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int leng = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; 	j++) {
				sum += array[i][j];
				leng++;
			}
		}
		
		double avg = (double)sum/leng;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
