package chap06.sec11;

public class Car {
	
	private int speed;
	private boolean stop;
	
	//setter : 데이터를 검증해서 유효한 값만 필드에 저장하는 메소드
	//getter : 필드값을 객체 외부에서 사용하기 위한 메소드
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			speed = 0;
		}
		this.speed = speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		if(stop == true)	this.speed = 0;
		this.stop = stop;
	}

}
