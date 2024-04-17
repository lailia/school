package chap07.sec2.exam1;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super();	//부모 생성자 호출
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone생성자의 자식 필드에 대입");
	}

}
