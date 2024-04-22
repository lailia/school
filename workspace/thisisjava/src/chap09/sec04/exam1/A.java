package chap09.sec04.exam1;

public class A {
	//로컬 클래스는 생성자나 메소드 내부에서 선언함
	//생성자
	A(){
		//A()생성자가 실행될 동안에만 로컬 클래스 B 객체를 생성할 수 있음
		class B{}	//로컬 클래스 선언
		B b = new B();	//로컬 객체 생성
	}
	
	//메소드 내부에서 로컬 클래스 선언
	void method() {
		//method()가 실행될 동안에만 로컬 클래스 B 객체를 생성할 수 있음
		class B{}	//로컬 클래스 선언
		B b = new B();	//로컬 객체 생성
	}

}
