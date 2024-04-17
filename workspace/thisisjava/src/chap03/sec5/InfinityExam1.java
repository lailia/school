package chap03.sec5;

public class InfinityExam1 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.00;
		//double z = x / y;	//무한대(Infinity) 출력
		double z = x % y;	//(Not a Number) 출력
		
		System.out.println("z : " + z);
		//잘못된 코드
		System.out.println("z : " + (z+2));
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("숫자가 아닙니다.");
		}
		else {
			System.out.println("z : " + (z+2));
		}

	}

}
