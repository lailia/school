package chap08.sec5;

public class RemoteControlExam1 {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		
		//default 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();

	}

}
