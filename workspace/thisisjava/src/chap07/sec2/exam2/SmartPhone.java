package chap07.sec2.exam2;

public class SmartPhone extends Phone{
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone 생성자 실행중");
	}

}
