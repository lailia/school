package chap07.sec5.exam2;

import chap07.sec5.exam1.A;

public class D extends A{
	
	public D() {
		//A() 생성자 호출
		super();	//부모 크래스
	}
	
	public void method2() {
		//A클래스의 필드값을 변경
		
		this.field = "value";
		this.method();
	}
	
	public void method3() {
		//A a = new A();	//사용 불가
		//a.field = "valuea"
		//a.method();
	}

}
