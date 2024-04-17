package chap02.sec3;

public class FlDoExam1 {

	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		//10의 거듭 제곱 리터럴
		float var3 = 3e6f;
		double var4 = 3e6;
		double var5 = 2e-3;
		
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);

	}

}
