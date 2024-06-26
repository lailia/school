package chap13.sec5;

public class GenericExam1 {

	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<middleStudent>(new middleStudent()));
		System.out.println();
		
		//Course.registerCourse2(new Applicant<Person>(new Person()));	//registerCourse2는 Student와 자식클래스만
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));	//대체 가능하기에 Person과 Worker는 대체 불가능
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<middleStudent>(new middleStudent()));
		System.out.println();
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));	//registerCourse3는 Worker와 부모인
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));	//Person만 대체 가능하기에
		//Course.registerCourse3(new Applicant<middleStudent>(new middleStudent()));	//Student들은 대체 불가능

	}

}
