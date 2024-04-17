package chap01.exam2;

public class Calculator {

	public static void main(String[] args) {
		int x=1;	//정수형 변수 x를 선언하고 1을 저장
		int y=2;	//정수형 변수 y를 선언하고 2를 저장
		int z=x+y;	//정수형 변수 z를 선언하고 x와 y를 더한 값을 저장
		int z1=x-y;
		int z2=x*y;
		float z3=(float)x/(float)y;
		
		System.out.println("x = " + x + " y = " + y);
		System.out.println("x + y = " + z);
		System.out.println("x - y = " + z1);
		System.out.println("x * y = " + z2);
		System.out.println("x / y = " + z3);
		
	}

}
