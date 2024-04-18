package chap08.sec2;

public class RemoteControlExam1 {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc변수에 television 객체를 대입
		rc = new Television();
		
		//인터페이스를 통해 구현 객체를 사용하려면, 인터페이스 변수에 구현 객체의 번지를 대입함
		rc.turnOn();
		
		//re변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		
		rc.turnOn();

	}

}
