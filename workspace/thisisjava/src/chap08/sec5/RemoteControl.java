package chap08.sec5;

public interface RemoteControl {
	
	int Max_Volume = 10;
	int Min_Volume = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int vol);
	
	//디폴트 인스턴스 메소드
	//인터페이스에는 완전한 실행코드를 가진 default 메소드를 선언 가능
	//default 메소드는 실행부가 있음
	//default 키워드는 리턴 타입 앞에 붙음
	//default 메소드의 실행부에는 상수 필드를 읽거나 추상 메소드를 호출하는 코드를 작성할수있음
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(Min_Volume);
		}
		else {
			System.out.println("무음 해제");
		}
	}

}
