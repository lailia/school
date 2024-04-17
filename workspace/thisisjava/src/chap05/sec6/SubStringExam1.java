package chap05.sec6;

public class SubStringExam1 {

	public static void main(String[] args) {
		String ssn = "990728-1234567";
		
		String firstNum = ssn.substring(0,6);
		
		System.out.println("first : " + firstNum);
		
		String secondNum = ssn.substring(7);
		
		System.out.println("second : " + secondNum);

	}

}
