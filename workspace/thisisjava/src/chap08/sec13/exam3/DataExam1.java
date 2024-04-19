package chap08.sec13.exam3;

public class DataExam1 {
	
	public static void db(DataObj dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		db(new Oracle());
		db(new MySql());

	}

}
