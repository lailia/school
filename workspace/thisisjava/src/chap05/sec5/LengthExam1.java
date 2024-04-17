package chap05.sec5;

public class LengthExam1 {

	public static void main(String[] args) {
		String ssn = "9907281234567";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민 등록 번호 자릿수가 맞습니다");
		}
		else {
			System.out.println("주민 등록 번호 자릿수가 틀립니다");
		}

	}

}
