package chap07.sec6.exam3;

public class ChildExam1 {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.field1 = "data1";
		
		parent.method1();
		parent.method2();
		System.out.println();
		
		//parent.field2 = "data2";	//접근 불가능
		//parent.method3();
		
		//강제 타입 변환
		Child child = (Child)parent;
		
		child.field1 = "data1";
		child.field2 = "data2";
		
		child.method1();
		child.method2();
		child.method3();

	}

}
