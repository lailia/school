package chap06.sec10.exam2.package1;	//A클래스와 동일한 패키지

public class B {
	A a1 = new A(true);	//가능
	A a2 = new A(1);	//가능
	//A a3 = new A("aa");	//불가능 <= private 생성자로 선언되어 있는건 다른 클래스에서 사용 불가능

}
