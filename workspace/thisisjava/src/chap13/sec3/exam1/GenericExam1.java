package chap13.sec3.exam1;

public class GenericExam1 {
	//제네릭 메소드
	public static <T> Box<T> boxing(T t){	//타입 파라미터
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메소드인 호출1
		Box<Integer> box1 = boxing(100);
		//T를 Integer로 대체함
		int intValue = box1.get();
		System.out.println(intValue);
		
		//제네릭 메소드인 호출1
		Box<String> box2 = boxing("홍길동");
		//T를 String으로 대체함
		String str = box2.get();
		System.out.println(str);
		
	}

}
