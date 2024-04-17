package chap06.sec7.exam1;

public class Calexam1 {

	public static void main(String[] args) {
		double result = 10 * 10 * Calculator.pi;
		
		//클래스 이름과 함께 . 연산자로 접근함
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(5, 2);
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}
