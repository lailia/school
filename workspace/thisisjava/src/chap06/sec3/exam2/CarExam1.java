package chap06.sec3.exam2;

public class CarExam1 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//Car 객체의 필드값 읽기
		System.out.println("제작 회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최대 속도 : " + car.maxSpeed);
		System.out.println("현재 속도 : " + car.speed);
		
		//Car 객체의 필드값 변경
		car.speed = 60;
		car.color = "빨강";
		
		System.out.println("색상 : " + car.color);
		System.out.println("현재 속도 : " + car.speed);

	}

}
