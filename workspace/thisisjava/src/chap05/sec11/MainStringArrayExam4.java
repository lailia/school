package chap05.sec11;

public class MainStringArrayExam4 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("입력값 부족");
			System.exit(0);
		}
		
		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[1]);
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);

	}

}
