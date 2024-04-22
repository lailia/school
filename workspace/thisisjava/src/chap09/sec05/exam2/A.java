package chap09.sec05.exam2;

public class A {
	//A인스턴스 필드 선언
	String field = "A-field";
	//A인스턴스 메소드 선언
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B{
		//B인스턴스 필드
		String field = "B-field";
		//B인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		
		//B인스턴스 메소드
		void print() {
			//B객체의 필드와 메소드 사용
			System.out.println(this.field);
			//this : 해당 중첩 클래스의 객체를 의미함
			this.method();
			
			//A객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			//중첩 클래스 내부에서 바깥 클래스의 객체를 얻으려면
			//바깥 클래스이름에 this를 붙여줌
			A.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}

}