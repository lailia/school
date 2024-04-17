package chap06.sec5.exam1;

public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//호출한 곳으로 결과값을 int로 리턴하는 메소드 선언
	int plus(int x, int y) {
		System.out.println("plus 메소드 실행");
		int result = x + y;
		return result;
	}
	
	//double로 리턴하는 메소드 선언
	double divide(int x, int y) {
		System.out.println("divide 메소드 실행");
		double result = (double)x / y;
		return result;
	}

}
