package chap13.sec5.exam2;

public class Container <T, P>{
	private T t;
	private P p;
	
	public void set(T t, P p) {
		this.t = t;
		this.p = p;
	}
	
	public T getKey() {
		return t;
	}
	
	public P getValue() {
		return p;
	}

}
