package chap08.sec4;

public interface RemoteControl {
	//상수 필드 선언
	int Max_Volume = 10;
	int min_Volume = 0;
	
	//추상 메소드 선언
	void turnOn();
	void turnOff();
	void setVolume(int vol);

}
