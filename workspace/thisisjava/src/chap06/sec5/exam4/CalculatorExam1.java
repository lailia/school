package chap06.sec5.exam4;

public class CalculatorExam1 {

	public static void main(String[] args) {
		//객체 생성
		Calculator cal1 = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = cal1.areaRectangle(10);
		//직사각형 넓이 구하기
		double result2 = cal1.areaRectangle(10, 20);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

	}

}
