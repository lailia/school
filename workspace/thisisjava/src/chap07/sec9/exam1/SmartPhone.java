package chap07.sec9.exam1;

public class SmartPhone extends Phone{
	
	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색");
	}

}
