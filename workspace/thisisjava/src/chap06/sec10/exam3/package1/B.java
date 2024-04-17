package chap06.sec10.exam3.package1;	//A클래스와 같은 패키지

public class B {
	
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 2;
		//a.field3 = 3;	//불가능 <= private 선언
		
		a.method1();
		a.method2();
		//a.method3();	//불가능 <= private 선언
	}

}
