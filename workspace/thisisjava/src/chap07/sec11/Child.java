package chap07.sec11;

public class Child extends Parent{
	
	public String name;
	
	public Child() {
		//super();	//부모 생성자 자동 생성
		this("홍길동");
		System.out.println("Child() 호출");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) 호출");
	}

}
