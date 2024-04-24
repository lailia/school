package chap12.sec3.exam3;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + "," + os;
	}
	
	//Object의 toString()메소드를 재정의해서 제조사와 os가 결합된 문자열을 리턴하도록 함

}
