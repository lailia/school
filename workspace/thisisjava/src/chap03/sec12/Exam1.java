package chap03.sec12;

public class Exam1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z =(++x) + (y--);
		System.out.println("z : " + z);

		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1 > 7) && (y1 <= 5));
		System.out.println((x1 % 3 == 2) || (y1 % 2 != 1));

		double x3 = 5.0;
		double y3 = 0.0;
		double z3 = x3 % y3;

		if(Double.isNaN(z3)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			double result = z3 + 10;
			System.out.println("결과 : " + result);
		}
		
	}

}
