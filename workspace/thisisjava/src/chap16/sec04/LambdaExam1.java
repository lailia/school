package chap16.sec04;

public class LambdaExam1 {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		person.action((x, y) -> (x+y));
		//return문 하나만 있을 경우에는 중괄호와 함께 return 키워드 생략 가능
		
		person.action((x, y) -> sum(x, y));

	}
	
	public static double sum(double x, double y) {
		return (x + y);
	}

}