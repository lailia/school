package chap05.sec5;

public class CharExam1 {

	public static void main(String[] args) {
		String ssn = "9907281234567";
		char s = ssn.charAt(6);
		
		switch(s) {
		case '1' :
		case '3' :
			System.out.println("남자입니다");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다");
			break;
		}

	}

}
