package chap17.sec12.exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap17.sec12.exam1.Student;

public class CollectExam1 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("홍길순", "여", 87));
		totalList.add(new Student("이길동", "남", 95));
		totalList.add(new Student("이길순", "여", 93));
		
		Map<String, Double> map = totalList.stream()
								 .collect(Collectors.groupingBy(s -> s.getS(),
										 Collectors.averagingDouble(s -> s.getScore())));
		//학생들을 성별로 그룹핑하고 각각의 평균 점수를 구해서 Map으로 얻는 코드
		
		System.out.println(map);

	}

}
