package chap04.sec2;

public class SwitchExam5 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
			case "A" : 
				score1 = 100; 
				break;
			case "B" : 
				int result = 100 - 20;
				score1 = result;
				break;
			default :
				score1 = 60;
		}
		
		System.out.println("score1 : " + score1);
		//JAVA 12 버전 부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				// JAVA 13버전 부터 가능
				yield result;
			}
			default -> 60;
		};
		
		System.out.println("score2 : " + score2);

	}

}
