package chap07.sec1;

public class Phone {
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨");
	}
	
	public void sendVoice(String msg) {
		System.out.println("자기 내용 : " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("상대 내용 : " + msg);
	}
	
	public void hangup() {
		System.out.println("전화를 끊기");
	}

}
