package chap06.sec11;

public class CarExam1 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(-50);
		
		System.out.println("속도 : " + car.getSpeed());
		
		car.setSpeed(50);
		
		System.out.println("속도 : " + car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println(car.isStop());

	}

}
