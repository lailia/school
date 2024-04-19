package chap08.sec10;

public class PromotionExam1 {

	public static void main(String[] args) {
		//구현 객체 선언
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수
		A a;
		
		//인터페이스 변수에 구현 객체 대입
		a = b;	//A <== B //인터페이스 A로 자동 타입 변환됨
		//B 클래스가 A인터페이스를 직접적으로 구현하고 있기 때문에 자동 타입 변환됨
		a = c;	//A <== C //인터페이스 A로 자동 타입 변환됨
		a = d;	//A <== D //인터페이스 A로 자동 타입 변환됨
		// D클래스가 A 인터페이스구현 하고 있는 B 클래스를 상속받아 간접적으로 구현하고 있어서 자동 타입 변환됨
		
		a = e;	//A <== E //인터페이스 A로 자동 타입 변환됨
		
		//부모 크래스가 인터페이스를 구현하고 있다면 자식 클래스도 인터페이스 타입으로 자동 타입 변환됨
		
	}

}
