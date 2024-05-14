package chap17.sec12.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap17.sec12.exam1.Student;

public class GroupingExam1 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("홍길순", "여", 87));
		totalList.add(new Student("이길동", "남", 95));
		totalList.add(new Student("이길순", "여", 93));
		
		Map<String, List<Student>> map = totalList.stream()
										.collect(Collectors.groupingBy(s -> s.getS()));
		//collect() 메소드는 요소 수집 기능 이외에 컬렉션의 요소들을 그룹핑해서 Map 객체를 생성하는 기능도 제공
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}

}
