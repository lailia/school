package chap09.sec02.exam2;

public class A {
	//인스턴스 멤버 클래스 B
	class B{
		//인스턴스 필드
		int field1 = 1;
		//정적 필드(java 17부터 허용)
		static int field2 = 2;
		
		B(){
			System.out.println("인스턴스 멤버 클래스 B-생성자 실행");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B-method1() 실행");
		}
		
		//정적 메소드(java 17부터 허용)
		static void method2() {
			System.out.println("B-method2() 실행");
		}

	}
	
	//인스턴스 메소드
	void useB() {
		//B객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		//B클래스의 정적 필드 및 정적 메소드 사용
		System.out.println();
		System.out.println(B.field2);
		B.method2();
		
	}
	//인스턴스 멤버 클래스 B 내부에는 필드, 생성자, 메소드 선언이 올 수 있음
	//정적 필드와 정적 메소드는 java17부터 선언 허용

}
