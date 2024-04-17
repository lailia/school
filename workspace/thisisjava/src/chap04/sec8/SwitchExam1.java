package chap04.sec8;

public class SwitchExam1 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
			case "A" ->{
				score1 = 100;
			}
			case "B" ->{
				int result = 100 - 20;
				score1 = result;
			}
			default ->{
				score1 = 60;
			}
		}
		
		System.out.println("score : " + score1);

	}

}
