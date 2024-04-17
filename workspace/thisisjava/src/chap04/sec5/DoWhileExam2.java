package chap04.sec5;

public class DoWhileExam2 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		do {
			b+=a;
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
		} while(a>b);
		
		System.out.println("do ~ while문 다음 문장");

	}

}
