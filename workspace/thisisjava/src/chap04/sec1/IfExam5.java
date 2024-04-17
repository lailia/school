package chap04.sec1;

public class IfExam5 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*20)+81;
		
		System.out.println("num : " + num);
		
		String grade;
		
		if(num >= 90) {
			if(num >= 95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		}
		else {
			if(num >= 85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("학점 : " + grade);

	}

}
