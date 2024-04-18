package chap07.sec9.exam1;

public abstract class Phone {
	//abstract : 추상 클래스
	//new 연산자를 이용해서 객체를 직접 생성 못함
	//상속을 통해서 자식 클래스만 만들수 있음
	//실재 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
	
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("전원 킴");
	}
	
	void turnOff() {
		System.out.println("전원 끔");
	}

}
