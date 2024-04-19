package chap08.sec13.exam3;

public class Oracle implements DataObj{
	
	public void select() {
		System.out.println("Oracle DB 검색");
	}
	
	public void insert() {
		System.out.println("Oracle DB 삽입");
	}
	
	public void update() {
		System.out.println("Oracle DB 수정");
	}
	
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}

}
