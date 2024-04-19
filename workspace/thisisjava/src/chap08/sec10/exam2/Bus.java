package chap08.sec10.exam2;

public class Bus implements Vehicle{
	
	public void run() {
		System.out.println("버스가 달림");
	}
	
	//추가 메소드
	public void checkFare() {
		System.out.println("승차 요금을 체크");
	}

}
