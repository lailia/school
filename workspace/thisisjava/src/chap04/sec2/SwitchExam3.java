package chap04.sec2;

public class SwitchExam3 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A' : 
		case 'a' : System.out.println("우수 회원"); break;
		case 'B' :
		case 'b' : System.out.println("일반 회원"); break;
		default : System.out.println("손님");
		}
		
		System.out.println("switch 다음 문장");

	}

}
