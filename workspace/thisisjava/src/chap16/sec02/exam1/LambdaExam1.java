package chap16.sec02.exam1;

public class LambdaExam1 {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근");
			System.out.println("프로그래밍");
		});
		
		person.action(() -> System.out.println("퇴근"));

	}

}
