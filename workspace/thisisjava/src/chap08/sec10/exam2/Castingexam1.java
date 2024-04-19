package chap08.sec10.exam2;

public class Castingexam1 {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();

		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare();
		System.out.println();
		
		//강제 타입 변환 후 checkFare() 호출 가능
		Bus bus = (Bus)vehicle;
		
		//인터페이스 타입을 구현 클래스 타입으로 변환시키는 것
		bus.run();
		bus.checkFare();
		
	}

}
