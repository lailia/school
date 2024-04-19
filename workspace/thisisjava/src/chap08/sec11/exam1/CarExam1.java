package chap08.sec11.exam1;

public class CarExam1 {

	public static void main(String[] args) {
		//Car객체 생성
		Car car = new Car();

		//run()메소드 실행
		car.run();
		
		//타이어 객체 교체
		car.tire1 = new KumhoTire();
		
		car.run();
		
	}

}
