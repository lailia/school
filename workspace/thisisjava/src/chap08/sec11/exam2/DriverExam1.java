package chap08.sec11.exam2;

public class DriverExam1 {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 객체 생성
		Bus bus = new Bus();
		
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입
		driver.drive(bus);
		driver.drive(taxi);
		//자동 타입 변환 ==> 오버라이딩 메소드 호출 ==> 다형성

	}

}
