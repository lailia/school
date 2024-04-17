package chap03.sec7;

public class LogicalExam1 {

	public static void main(String[] args) {
		//int charCode = 'A';
		//int charCode = 'b';
		int charCode = '5';
		
		if((65 <= charCode) & (charCode <= 90)) {			//& 조건 전부를 비교함
			System.out.println("대문자");
		}
		else if((97 <= charCode) && (charCode <= 122)) {	//&& 앞의 조건이 false면 뒤 조건식은 평가하지 않고 false를 도출함
			System.out.println("소문자");
		}
		else if((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 사이의 숫자");
		}
		
		int value = 6;
		
		/*if((value % 2 ==0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수");
		}*/
		
		boolean result = (value % 2 == 0) || (value % 3 == 0);	//||앞의 조건이 true면 뒤 조건식은 평가하지 않고 true를 도출함
		
		System.out.println("result : " + result);
		
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니다");
		}
		else {
			System.out.println("2 또는 3의 배수");
		}
		
	}

}
