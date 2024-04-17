package chap07.sec6.exam2;

public class ChildExam1 {

	public static void main(String[] args) {
		//자식 색체 생성
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();	//메소드 오버라이딩된 Child-method2()가 출력
		//parent.method3();	//호추 불가능

	}

}
