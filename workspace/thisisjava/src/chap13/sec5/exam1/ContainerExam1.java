package chap13.sec5.exam1;

public class ContainerExam1 {
	public static void main(String[] args) {
		Container<String> cont1 = new Container<String>();
		cont1.set("홍길동");
		String str = cont1.get();
		
		System.out.println(str);
		
		Container<Integer> cont2 = new Container<Integer>();
		cont2.set(6);
		int value = cont2.get();
		
		System.out.println(value);
		
	}

}
