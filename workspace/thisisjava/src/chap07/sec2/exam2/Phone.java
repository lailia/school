package chap07.sec2.exam2;

public class Phone {
	public String model;
	public String color;
	
	//매개 변수를 갖는 생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행중");
	}
}
