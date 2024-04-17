package chap04.sec8;

public class ForExam1 {

	public static void main(String[] args) {
		System.out.println("4x + 5y = 60이 되는 모든 해를 구하기");
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(((4*x) + (5*y)) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		System.out.println("종료");

	}

}
