package chap08.sec11.exam1;

public class Car {
	//인터페이스 필드 선언 및 객체 대입
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();	//인터페이스에 선언된 추상 메소드를 호출함
		// ==> 구현 객체의 재정의한 roll()메소드를 실행함
		tire2.roll();
	}

}
