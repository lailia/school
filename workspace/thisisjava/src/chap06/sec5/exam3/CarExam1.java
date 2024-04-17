package chap06.sec5.exam3;

public class CarExam1 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car c1 = new Car();
		
		//리턴값이 없는 setGas() 메소드 호출
		c1.setGas(5);
		
		//isLeftGas() 메소드의 리턴값이 true 일 경우 if 실행
		if(c1.isLeftGas()) {
			System.out.println("자동차 출발");
			c1.run();
		}
		
		System.out.println("gas를 주입하세요");
		
	}

}
