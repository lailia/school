package chap09.sec04.exam2;

public class A {
	//메소드
	void useB() {
		//로컬 클래스 선언
		//로컬 클래스 B 내부에는 필드, 생성자, 메소드 선언이 올 수 있음
		class B{
			int field1 = 1;
			static int field2 = 2;
			
			B(){
				System.out.println("B-생성자 실행");
			}
			
			void method1() {
				System.out.println("로컬 클래스 B-method1() 실행");
			}
			
			static void method2() {
				System.out.println("로컬 클래스 B-method2() 실행");
			}
		}
		
		//로컬 클래스 객체 생성
		B b = new B();
		//로컬 객체의 인스턴스 필드와 메소드 이용
		System.out.println(b.field1);
		b.method1();
		//로컬 클래스의 정적 필드와 정적 메소드 사용
		System.out.println(B.field2);
		B.method2();
	}

}
