package chap05.sec11;

public class MainStringArrayExam3 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("입력값 부족");
			System.exit(0);
		}
		
		float fStr1 = Float.parseFloat(args[0]);
		float fStr2 = Float.parseFloat(args[1]);
		
		System.out.println("str1 : " + fStr1);
		System.out.println("str2 : " + fStr2);

	}

}
