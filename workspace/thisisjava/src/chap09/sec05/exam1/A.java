package chap09.sec05.exam1;

public class A {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}

	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
	}
	
	//정적 멤버 클래스 선언
	static class C{
		void method() {
			//A클래스의 인스턴스 필드와 메소드 사용
			//field1 = 20;
			//method1();
			//A클래스의 정적 필드와 정적 메소드 사용
			field2 = 30;
			method2();
			//정적 멤버 클래스는 바깥 객체가 없어도 사용 가능해야 하므로
			//바깥 클래스의 인스턴스 필드와 메소드를 사용할 수 없음
		}
	}
	
}
