package chap06.sec4.exam5;

public class Car1 {
	//필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car1(String model){
		this(model, "은색", 250);
		System.out.println("생성자 1");
	}
	
	Car1(String model, String color){
		this(model, color, 250);
		System.out.println("생성자 2");
	}
	
	Car1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("생성자 3");
	}
	
}
