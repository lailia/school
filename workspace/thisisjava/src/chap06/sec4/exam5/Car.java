package chap06.sec4.exam5;

public class Car {
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		//this.model = model;
		//this.color = "은색";
		//this.maxSpeed = 250;
		this(model, "은색", 250);
	}
	
	Car(String model, String color){	
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 250;
		this(model, color, 250);	//생성자 첫줄에 위치해야 에러가 안남
	}
	
	Car(String model, String color, int maxSpeed){	//공통 초기화 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
