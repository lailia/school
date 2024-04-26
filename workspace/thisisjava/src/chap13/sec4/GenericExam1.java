package chap13.sec4;

public class GenericExam1 {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		//타입 파라미터 T를 대체할 타입을 Number로 제한
		System.out.println("compare(" + t1.getClass().getSimpleName() +", " + t2.getClass().getSimpleName() + ")");
		//Number 타입의 메소드를 사용할 수 있음
		//Number 타이의 doubleValue()메소드를 호출함
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1 = compare(10, 20);	
		//T를 Integer타입으로 대체
		System.out.println(result1);
		System.out.println();
		//제네릭 메소드 호출
		boolean result2 = compare(4.5, 4);
		//T를 Double 타입으로 대체
		System.out.println(result2);

	}

}
