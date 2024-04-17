package chap03.sec10;

public class AssigExam1 {

	public static void main(String[] args) {
		int a = 0;
		a = a + 10;
		a += 10;	//a = a + 10
		a *= 10;	//a = a * 10
		a -= 10;	//a = a - 10
		a /= 10;	//a = a / 10
		a++;		//a = a + 1
		a--;		//a = a - 1
		
		int result = 0;
		result += 10;
		System.out.println("result : " + result);
		result *= 10;
		System.out.println("result : " + result);
		result -= 10;
		System.out.println("result : " + result);
		result /= 10;
		System.out.println("result : " + result);
		result %= 10;
		System.out.println("result : " + result);

	}

}
