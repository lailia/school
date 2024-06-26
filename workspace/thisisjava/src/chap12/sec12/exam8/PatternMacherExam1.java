package chap12.sec12.exam8;

import java.util.regex.Pattern;

public class PatternMacherExam1 {

	public static void main(String[] args) {
		String id = "5angel1004";
		String regExp = "[a-zA-z]{1}\\w{7,11}";
		//[a-zA-z] : 첫 글자는 영문자(대소문자 상관없음)
		
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용 가능");
		}
		else {
			System.out.println("ID로 사용 불가");
		}

	}

}
