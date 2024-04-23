package chap12.sec3.exam2;

public class HashCodeExam1 {
	//객체 해시코드 : 객체를 식별하는 정수
	//Object클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서
	//해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴함

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1.hashCode() == s2.hashCode()) {	//해시코드가 동일한지 검사
			if(s1.equals(s2)) {	//데이터가 동일한지 검사
				System.out.println("똑같은 객체");
			}
			else {
				System.out.println("다른 객체");
			}
		}
		else {
			System.out.println("해시코드가 다르므로 다른 객체");
		}

	}

}
