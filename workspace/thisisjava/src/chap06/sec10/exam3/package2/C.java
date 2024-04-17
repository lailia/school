package chap06.sec10.exam3.package2;

import chap06.sec10.exam3.package1.A;

public class C {
	
	public C() {
		A a = new A();
		
		a.field1 = 10;
		//a.field2 = 10;	//default
		//a.field3 = 10;	//private
		
		a.method1();
		//a.method2();		//default
		//a.method3();		//private
	}
	
}
