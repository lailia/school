package chap13.sec5.exam3;

public class UtilExam1 {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> chilPair = new ChildPair<>("홍삼원", 20);
		Integer chilAge = Util.getValue(chilPair, "홍삼순");
		System.out.println(chilAge);

	}

}
