package chap04.sec2;

public class SwitchExam4 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A' , 'a' ->{
				System.out.println("우수 회원 입니다");
			}
			case 'B' , 'b' ->{
				System.out.println("일반 회원 입니다");
			}
			default ->{
				System.out.println("손님입니다");
			}
		}
		
		System.out.println("switch 다음 문장");
		
		switch(grade) {
			case 'A' , 'a' -> System.out.println("우수 회원 입니다");
			case 'B' , 'b' -> System.out.println("일반 회원 입니다");
			default -> System.out.println("손님입니다");
		}
		
		System.out.println("switch 다음 문장");
		
	}

}
