package chap06.sec8.exam1;

public class Korean {
	//인스턴스 final 필드 선언
	//final 필드는 초기값이 저장되면 수정할수 없음
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	public Korean(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}

}
