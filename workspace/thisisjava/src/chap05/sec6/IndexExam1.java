package chap05.sec6;

public class IndexExam1 {

	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		int location = sub.indexOf("프로");
		
		System.out.println(location);
		
		String subS = sub.substring(location);
		
		System.out.println(subS);
		
		location = sub.indexOf("자바");
		
		System.out.println(location);

		if(location != -1) {
			System.out.println("자바와 관련");
		}
		else {
			System.out.println("자바와 관련 없음");
		}
		
		boolean result = sub.contains("자바");
		if(result) {
			System.out.println("자바와 관련");
		}
		else {
			System.out.println("자바와 관련 없음");
		}
		
	}

}
