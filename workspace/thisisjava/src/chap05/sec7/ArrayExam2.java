package chap05.sec7;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[] scores;	//배열 변수 선언
		int sum1 = 0;
		scores = new int[] {83, 90, 87};	//배열 변수에 데이터 대입
		
		for(int i = 0; i < scores.length; i++) {	//총합 구하기
			sum1 += scores[i];
		}
		
		System.out.println("sum : " + sum1);	//총합 찍기
		System.out.println();
		printItem(new int[] {83, 90, 87});	//printItem()메소드 호출
		System.out.println();
		printItem(new int[] {91, 67, 90, 95});

	}
	
	//printItem()메소드 선언
	public static void printItem(int[] scores) {
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
			sum1 += scores[i];
		}

		System.out.println("sum : " + sum1);
	}

}
