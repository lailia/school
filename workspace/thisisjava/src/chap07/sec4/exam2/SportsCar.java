package chap07.sec4.exam2;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//부모 클래스에서 final로 서언된 메소드는 오버라이딩 할 수 없음
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/

}
