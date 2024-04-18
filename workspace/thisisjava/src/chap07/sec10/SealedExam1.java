package chap07.sec10;

public class SealedExam1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.work();

		Employee e = new Employee();
		e.work();
		
		Manager m = new Manager();
		m.work();
		
		Director d = new Director();
		d.work();
		
		
	}

}
