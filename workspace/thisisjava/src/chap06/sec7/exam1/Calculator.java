package chap06.sec7.exam1;

public class Calculator {
	//정적 멤버 : 메소드 영역의 클래스에 고정적으로 사용할수 있음   
	//정적 필드, 정적 메소드(메소드 영역의 클래스에 고정적으로 위치하는 멤버
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}

}
