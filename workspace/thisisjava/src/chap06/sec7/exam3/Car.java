package chap06.sec7.exam3;

public class Car {
	//인스턴스 필드 선언
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	static void simulate() {
		Car car = new Car();
		car.speed = 200;
		car.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car car = new Car();
		
		car.speed = 60;
		car.run();
	}

}
