package chap04.sec1;

public class IfExam3 {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("A등급");
		}
		else if(score >= 80) {
			System.out.println("B등급");
		}
		else if(score >= 70) {
			System.out.println("C등급");
		}
		else if(score >= 60) {
			System.out.println("D등급");
		}
		else {
			System.out.println("F등급");
		}

		System.out.println("if 다음문장입니다");
		
	}

}
