package chap07.sec5.exam2;

import chap06.sec10.exam3.package1.A;

public class C {
	
	public void method() {
		A a = new A();
		//a.field1 = "value";	//protected라 다른 패키지에서는 사용 불가
		//a.method();
	}

}
