package chap16.sec01;

public class LambdaExam1 {

	public static void main(String[] args) {
		action ((x,y) -> {	//람다식 1
			int result = x + y;
			System.out.println("result : " + result);
		});
		
		action ((x,y) -> {	//람다식 2
			int result = x - y;
			System.out.println("result : " + result);
		});
		
	}
	
	public static void action(Calculable cal) {
		//데이터 제공
		
		int x = 10;
		int y = 4;
		//데이터 처리
		cal.calsculate(x, y);
	}
}
