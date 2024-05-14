package chap17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExam1 {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("김길동", 95),
				new Student("이길동", 88)
				);
		
		int sum1 = studentList.stream()
				   .mapToInt(Student::getScore)
				   .sum();
		
		System.out.println("sum총합 : " + sum1);
		
		int sum2 = studentList.stream()
				   .map(Student::getScore)
				   .reduce(0, (a,b) -> a+b);
		//reduce() : 다양한 집계 결과물을 만들 수 있음
		
		System.out.println("resuce총합 : " + sum2);

	}

}
