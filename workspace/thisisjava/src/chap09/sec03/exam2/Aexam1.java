package chap09.sec03.exam2;

public class Aexam1 {

	public static void main(String[] args) {
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		System.out.println();
		
		System.out.println(A.B.field2);
		A.B.method2();

	}

}
