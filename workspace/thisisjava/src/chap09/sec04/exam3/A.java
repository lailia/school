package chap09.sec04.exam3;

public class A {
	
	public void method1(final int arg) {
		final int var = 1;	//로컬 변수 선언
		
		class B{
			void method2() {
				System.out.println(arg);	//읽기 가능
				System.out.println(var);	//읽기 가능
				
				//arg = 20;	//수정 불가
				//var = 30;	//수정 불가
				//로컬 변수를 로컬 클래스에서 사용할 경우 로컬 변수는 final 특성을 갖게 되므로
				//로컬 변수의 값을 읽기만 가능하며 변경은 불가능함
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		b.method2();	//로컬 객체 메소드 호출
		//로컬 변수 수정
		//arg = 20;
		//var = 30;
	}

}
