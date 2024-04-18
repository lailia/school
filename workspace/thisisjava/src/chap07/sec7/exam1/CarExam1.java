package chap07.sec7.exam1;

public class CarExam1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.t1 = new Tire();
		
		car.run();
		
		//HankookTire 객체 장착
		car.t1 = new HankookTire();
		
		car.run();
		
		//KumhoTire 객체 장착
		car.t1 = new KumhoTire();
		
		car.run();

	}

}
