package chap16.sec05.exam1;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(20, 4);
		System.out.println("결과 : " + result);
	}

}
