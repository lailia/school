package chap04.sec7;

public class ContinueExam1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.println("i : " + i);
		}

		System.out.println("for문 종료");
	}

}
