package chap06.sec5.exam1;

public class CalculatorExam1 {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		int result1 = myCal.plus(50, 60);
		System.out.println("result1 : " + result1);
		System.out.println();
		
		double result2 = myCal.divide(30, 40);
		System.out.println("result2 : " + result2);
		System.out.println();
		
		myCal.powerOff();

	}

}