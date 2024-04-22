package chap09.sec03.exam2;

public class A {
	//정적 멤버 클래스 선언
	static class B{
		int field1 = 1;
		
		static int field2 = 2;
		
		B(){
			System.out.println("정적 멤버 클래스 B-생성자 실행");
		}
		
		void method1() {
			System.out.println("B-method1() 실행");
		}
		
		static void method2() {
			System.out.println("B-method2() 실행");
		}
		
	}

}
