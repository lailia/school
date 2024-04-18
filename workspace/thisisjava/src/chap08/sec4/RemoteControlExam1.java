package chap08.sec4;

public class RemoteControlExam1 {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(15);
		rc.setVolume(-5);
		rc.turnOff();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(15);
		rc.setVolume(-5);
		rc.turnOff();

	}

}
