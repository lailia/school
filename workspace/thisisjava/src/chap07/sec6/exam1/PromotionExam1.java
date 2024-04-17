package chap07.sec6.exam1;

class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
class D extends B {

}
class E extends C {

}

public class PromotionExam1 {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;	//부모 타입변수 = 자식 타입변수 (자동 타입 변환)
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;	//자동 타입 변환
		C c1 = e;	
		
		//B b2 = e;	//직접적인 상속관계가 아니라서 컴파일 에러
		//C c2 = d;
		
	}

}
