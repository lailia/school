package chap13.sec5.exam2;

public class ContainerExam1 {
	public static void main(String[] args) {
		Container<String, String> cont1 = new Container<String, String>();
		cont1.set("홍길동", "도적");
		String name1 = cont1.getKey();
		String job = cont1.getValue();
		
		System.out.println(name1);
		System.out.println(job);
		System.out.println();
		
		Container<String, Integer> cont2 = new Container<String, Integer>();
		cont2.set("홍길동", 35);
		String name2 = cont2.getKey();
		int age = cont2.getValue();
		
		System.out.println(name2);
		System.out.println(age);
	}

}
