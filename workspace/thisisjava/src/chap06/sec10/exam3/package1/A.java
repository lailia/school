package chap06.sec10.exam3.package1;

public class A {
	public int field1;
	int field2;		//default 접근 제한을 갖는 필드 선언
	private int field3;	//private 접근 제한을 갖는 필드 선언
	
	public A() {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}

}
