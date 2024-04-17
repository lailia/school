package chap06.sec4.exam2;

public class Korean {	//라이브러리 클래스
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
	
	public Korean(String n1, String n2, String s) {
		nation = n1;
		name = n2;
		ssn = s;
	}

}
