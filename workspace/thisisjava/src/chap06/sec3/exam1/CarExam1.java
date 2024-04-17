package chap06.sec3.exam1;

public class CarExam1 {

	public static void main(String[] args) {
		Car car = new Car();	//Car 객체 생성
		
		System.out.println("모델 명 : " + car.model);
		System.out.println("시동 여부 : " + car.start);
		System.out.println("속도 : " + car.speed);

	}

}
