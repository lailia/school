package chap13.sec2.exam1;

public class Product<K,M> {
	private K kind;
	private M model;
	
	public K getKind() {return this.kind;}
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
	//타입 파라미터를 매개 변수 타입으로 사용
	//
}
