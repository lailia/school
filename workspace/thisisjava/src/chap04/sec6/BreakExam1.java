package chap04.sec6;

public class BreakExam1 {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			
			System.out.println("num : " + num);
			
			if(num == 5) {
				break;
			}
		}
		
		System.out.println("while문 반복 끝");

	}

}
