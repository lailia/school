package chap13.sec5;

public class Course {
	//모든 사람이면 등록 가능 
	//<?> : 어떤 타입이든 가능하도록 매개 변수 선언
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//학생만 등록 가능	<? extends Student
	//타입 파라미터 뒤에 대체 타입으로 Student와 자식클래스만 가능하도록 매개 변수 선언
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	
	//직장인 및 일반인만 등록 가능	<? super Worker
	//Worker와 부모 클래스인 Person만 대체 가능하도록 매개 변수 선언
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}

}
