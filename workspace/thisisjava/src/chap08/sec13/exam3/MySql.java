package chap08.sec13.exam3;

public class MySql implements DataObj{
	
	public void select() {
		System.out.println("MySql DB 검색");
	}
	
	public void insert() {
		System.out.println("MySql DB 삽입");
	}
	
	public void update() {
		System.out.println("MySql DB 수정");
	}
	
	public void delete() {
		System.out.println("MySql DB 삭제");
	}

}
