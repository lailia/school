package chap06.sec10.exam1.package2;

import chap06.sec10.exam1.package1.B;

public class C {
	//A a	//불가능 <== A 클래스는 default로 선언되어 있어서 다른패키지에서는 사용 불가능
	B b;	//가능 <== public 선언자는 다른 패키지에서도 사용 가능함

}
