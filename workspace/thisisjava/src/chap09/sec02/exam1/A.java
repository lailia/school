package chap09.sec02.exam1;

public class A {
	//인스턴스 멤버 클래스
	class B{
		
	}
	
	//인스턴스 필드 값으로 B객체 대입
	B field = new B();
	
	A(){
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
	
	//인스턴스 멤버 클래스 B 객체는 인스턴스 필드값, 생성자, 인스턴스 메소드에서 생성함

}
