package chap06.sec10.exam2.package2;	//A, B 크래스와 다른 패키지

import chap06.sec10.exam2.package1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1);		//다른 패키지에서 default생성자 접근 불가능
	//A a3 = new A("aa");	//private 선언자는 자기 클래스에서만 사용가능

}
