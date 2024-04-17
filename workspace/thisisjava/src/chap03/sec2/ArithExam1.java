package chap03.sec2;

public class ArithExam1 {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		long v4 = 10l;
		
		int result1 = v1 + v2;	//모든 피연산자는 int타입으로 자동 변환 후 연산
		
		System.out.println("result1 : " + result1);
		
		long result2 = v1+v2-v4;	//long타입이 있으면 모든 피연산자는 long타입으로 자동 변환 후 연산
		
		System.out.println("result2 : " + result2);
		
		double result3 = (double)v1/v2;	//double타입으로 강제 타입변환 후 연산
		
		System.out.println("result3 : " + result3);
		
		int result4 = v1 %v2;	//v1을 v2로 나눈 후 나머지 값
		
		System.out.println("result4 : " +result4);

	}

}
