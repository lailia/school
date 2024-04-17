package chap07.sec5.exam1;

public class B {
	
	public void method() {
		A a = new A();	//사용 가능
		a.field = "value";
		a.method();
	}
	
	//protected
	//A클래스의 protected 선언된 필드, 생성자, 메소드는 
	//동일한 패키지에 저장된 클래스들은 모두 접근해서 사용 가능
	//protected는 같은 패키지에서는 default처럼 모두 접근이 가능하지만 다른패키지에서는 접근이 안됨
	//다른 패키지 더라도 protected가 있는 클래스를 상속받으면 사용 가능

}
