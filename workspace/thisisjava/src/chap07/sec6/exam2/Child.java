package chap07.sec6.exam2;

public class Child extends Parent{
	//메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	//새 메소드 선언
	public void method3() {
		System.out.println("Child-method3()");
	}

}
