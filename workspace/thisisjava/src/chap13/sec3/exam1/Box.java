package chap13.sec3.exam1;

public class Box<T> {	//제네릭 타입인 Box 클래스 선언
	private T t;	//필드 선언
	
	public T get() {	//Getter 메소드
		return t;
	}
	
	public void set(T t) {	//Setter 메소드
		this.t = t;
	}

}
