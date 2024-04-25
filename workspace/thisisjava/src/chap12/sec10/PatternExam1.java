package chap12.sec10;

import java.util.regex.Pattern;

public class PatternExam1 {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";	//\d : 숫자
		//() : 선택, {} : 중괄호 안에 오는 숫자만큼 반복
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		regExp = "\\w+@\\w+ \\.\\w+(\\.\\w+)?";
		//\w+ (영문자 1개이상)	, \. 는 . 을 반드시 표시
		//angle@mycompany.com.go (\\.\\w+)? => 한번 더 반복할수 있음
		data = "angel@mycompany.com";
		result = Pattern.matches(regExp, data);

		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
	}

}
