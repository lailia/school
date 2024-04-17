package chap06.sec4.exam4;

public class Car {
	//필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	public Car() {
		System.out.println("생성자 1");
	}
	
	public Car(String model) {
		System.out.println("생성자 2");
		this.model = model;
	}
	
	public Car(String model, String color) {
		System.out.println("생성자 3");
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxSpeed) {
		System.out.println("생성자 4");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
