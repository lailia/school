package chap16.sec07.exam8;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("김길동", 95, 93)
	};
	
	public static double avg(Function<Student> function) {
		int result = 0;
		for(Student student : students) {
			result += function.apply(student);
		}
		
		return ((double)result/students.length);
	}
	
//	public static void main(String[] args) {
//		double englishAvg = avg(s -> s.getEnglishScore());
//		System.out.println("영어 평균 점수 : " + englishAvg);
//		
//		double mathAvg = avg(s -> s.getMathScore());
//		System.out.println("수학 평균 점수 : " + mathAvg);
//
//	}
	
	//메소드 참조형
	public static void main(String[] args) {
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수 : " + mathAvg);

	}

}
