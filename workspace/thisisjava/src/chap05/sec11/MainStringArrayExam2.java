package chap05.sec11;

public class MainStringArrayExam2 {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("입력값이 부족");
			System.exit(0);
		}
		
		String num1 = args[0];
		String num2 = args[1];
		String num3 = args[2];
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);

	}

}
