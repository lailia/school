package chap06.sec4.exam3;

public class Korean {	//라이브러리 클래스
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;	//this는 현재 객체를 의미함
		this.ssn = ssn;
	}
	
}
