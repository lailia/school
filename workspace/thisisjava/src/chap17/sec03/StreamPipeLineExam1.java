package chap17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamPipeLineExam1 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("김길동", 20),
				new Student("강길동", 30)
				);
		
		//방법 1
//		Stream<Student> studentStream = list.stream();
//		//Student 객체를 점수로 매핑
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		//평균
//		double avg = scoreStream.average().getAsDouble();
		
		//방법2
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균 : " + avg);

	}

}
