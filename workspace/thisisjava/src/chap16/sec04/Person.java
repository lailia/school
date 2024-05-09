package chap16.sec04;

public class Person {
	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		System.out.println("결과 : " + result);
	}
	//Calculable 을 배개변수로 갖는 action 메소드를 작성함
	
}
