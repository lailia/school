package chap07.sec8;

public class InstanceofExam1 {
	
	public static void personInfo(Person person) {
		System.out.println("이름 : " + person.name);
		person.walk();

		if(person instanceof Student student) {
			System.out.println("번호 : " + student.studentNo);
			student.study();
		}
		//instanceof
		//person이 참조하는 개체가 Student타입인지 확인함
		//Student객체만 가지고 있는 필드 및 메소드 사용 personInfo() 메소드 호출
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		//Student객체를 매개값으로 제공하고 personInfo()메소드 실행
		
		Person p2 = new Student("김길동",30);
		personInfo(p2);
		
	}

}