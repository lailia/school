package chap04.sec8;

public class WhileExam1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		while(true) {
			x = (int)(Math.random()*6)+1;
			y = (int)(Math.random()*6)+1;
			
			System.out.println("(" + x + " , " + y + ")");
			
			if(x+y==5) {
				break;
			}
		}
		
		System.out.println("while문 종료");

	}

}